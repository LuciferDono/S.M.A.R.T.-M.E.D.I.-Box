import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 5000; // Change if needed

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Handshake
            String clientMessage = in.readLine();
            System.out.println("Client says: " + clientMessage);
            out.println("Hello Client, nice to meet you!");

            // File transfer
            DataInputStream dataIn = new DataInputStream(socket.getInputStream());
            String fileName = dataIn.readUTF();
            long fileSize = dataIn.readLong();

            System.out.println("Receiving file: " + fileName + " (" + fileSize + " bytes)");

            FileOutputStream fileOut = new FileOutputStream("received_" + fileName);
            byte[] buffer = new byte[4096];
            long totalRead = 0;
            int read;

            while ((read = dataIn.read(buffer)) > 0) {
                totalRead += read;
                fileOut.write(buffer, 0, read);
                if (totalRead >= fileSize) break;
            }

            fileOut.close();
            System.out.println("File received successfully.");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

