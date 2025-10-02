package Java.day31_251002;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPEchoServer {
    private static final int PORT = 9876;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(PORT)) {    // 먼저 보내야해서 포트 넘버를 미리 지정
            System.out.println("UDPEchoServer starting...");
            byte[] buffer = new byte[BUFFER_SIZE];

            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                String message = new String(packet.getData(), 0, packet.getLength());

                System.out.println("받은 메시지 :: " + message);


                // 클라이언트가 보낸 메시지를 다시 클라이언트에게 보내야 함.
                // 데이터를 전송하기 위해서는 데이터, 데이터 크기, 클라이언트 ip, 클라이언트 port가 필요
                String responseMessage = "Echo : " + message;
                byte[] responseBuffer = responseMessage.getBytes(); // String을 byte로 변환

                DatagramPacket sendPacket = new DatagramPacket(
                        responseBuffer,             // 보낼 데이터
                        responseBuffer.length,      // 데이터의 크기
                        packet.getAddress(),        // 누구한테 보낼지 (주소)
                        packet.getPort()            // 받을 사람의 포트번호
                );

                socket.send(sendPacket);
                System.out.println("전송 : " + responseMessage);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
