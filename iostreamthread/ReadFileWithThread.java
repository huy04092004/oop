import java.io.*;

class FileReaderThread extends Thread {
    private String filePath;

    public FileReaderThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(500); // Tạm dừng 0.5 giây để mô phỏng quá trình đọc
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

public class ReadFileWithThread {
    public static void main(String[] args) {
        String filePath = "test.txt"; // Đường dẫn file cần đọc
        FileReaderThread fileReaderThread = new FileReaderThread(filePath);
        fileReaderThread.start();
    }
}
