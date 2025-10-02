package Java.day31_251002;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPEchoClient {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 9876;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try(
                DatagramSocket socket = new DatagramSocket();   // 포트넘버 비우고 생성하면 자동으로 빈 포트넘버를 사용함, 지정해도 상관은 없는데 충돌할 수도 있음.
                Scanner keyboard = new Scanner(System.in);
        ) {
            // 키보드로부터 서버에 전송할 문자를 입력받는다.
            // 입력받은 문자를 서버에게 보낸다.

            // 서버의 IP를 추상화한 InetAddress 를 생성한다.
            InetAddress serverAddress = InetAddress.getByName(SERVER_HOST);
            byte[] buffer = new byte[BUFFER_SIZE];  // 데이터 보낼 때 바이트 배열로 보내야함
            System.out.println("서버에게 보낼 메시지 입력, quit 입력 시 종료");

            while (true) {
                String message = keyboard.nextLine();   // 서버에게 보낼 데이터를 입력

                if("quit".equalsIgnoreCase(message)) {
                    break;
                }
                // 서버에게 데이터 전송하기 위해서 DatagramPacket 생성
                byte[] sendData = message.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(
                        sendData,           // 보낼 데이터
                        sendData.length,    // 보낼 데이터의 길이
                        serverAddress,      // IP주소
                        SERVER_PORT         // 포트넘버
                );
                
                socket.send(sendPacket);    // 데이터 전송

                // 서버가 보낸 패킷을 받는 코드
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);

                // 0부터 receivePacket의 길이만큼 데이터 추출
                String responseMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println(responseMessage);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
