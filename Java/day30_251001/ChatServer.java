package Java.day30_251001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ChatServer {
    private static final int PORT = 12345;
    private static Set<ClientHandler> clients = ConcurrentHashMap.newKeySet();

    private static void broadcast(String message, ClientHandler sender) {
        for(ClientHandler client : clients) {
            if(!client.equals(sender)) {
                client.sendMessage(message);
            }else{
                client.sendMessage("내가 보낸 메시지 ::" + message);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("채팅 서버 시작");

        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                clients.add(clientHandler);

                new Thread(clientHandler).start();
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;
        private String nickname;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void sendMessage(String message) {
            if (out != null) {
                out.println(message);
            }
        }

        private void notification() {
            this.sendMessage("==================== 채팅 사용법 ====================");
            this.sendMessage("1. 일반 메시지: 내용을 입력 후 엔터");
            this.sendMessage("2. 귓속말: /to [대상닉네임] [내용] 형식으로 입력");
            this.sendMessage("   예) /to userA 안녕하세요.");
            this.sendMessage("3. 종료: bye 를 입력 후 엔터");
            this.sendMessage("4. 도움말: /help 를 입력 후 엔터");
            this.sendMessage("==================================================");
        }

        @Override
        public void run() {
            try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    ) {
                out = new PrintWriter(socket.getOutputStream(), true);

                // 닉네임을 입력받고 싶다.
                out.println("닉네임 입력");
                nickname = in.readLine();

                if (nickname == null) {
                    return;
                }

                System.out.println(nickname + "님 입장");

                notification();     // 채팅 사용법 공지

                // 채팅방에 있는 전체 사용자에게 알리고 싶다.
                broadcast(nickname+" 님 입장", this);

                String message = null;
                while ((message = in.readLine()) != null){
                    if ("bye".equalsIgnoreCase(message)) {
                        break;
                    }
                    else if ("/help".equalsIgnoreCase(message)) {   // 사용법 호출
                        notification();
                    }
                    else {
                        broadcast(message, this);
                    }
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {

                if (nickname != null) {
                    System.out.println(nickname + "님 퇴장");
                    broadcast(nickname + "님 퇴장", this);
                }

                // try{
                //     out.close();
                // }catch (Exception e) {
                //     System.out.println(e.getMessage());
                // }

                try{
                    socket.close();
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

