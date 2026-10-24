import java.io.*;
import java.net.*;

public class ChatBot_Server {
    public static void main(String[] args) {
      try {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Waiting for client...");
        System.out.println("Server Started");

        Socket socket = ss.accept();
        System.out.println("Client connected\n");
        

      
      }
    }
}