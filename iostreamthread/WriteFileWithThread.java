import java.io.*;

class FileWriterThread extends Thread {
    private String filePath;
    private String message;

    public FileWriterThread(String filePath, String message) {
        this.filePath = filePath;
        this.message = message;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (int i = 0; i < 5; i++) {
                writer.write(message + "\n");
                System.out.println(Thread.currentThread().getName() + " ghi: " + message);
                Thread.sleep(500); // Tạm dừng 0.5 giây để mô phỏng quá trình ghi
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}

public class WriteFileWithThread {
    public static void main(String[] args) {
        String filePath = "test.txt"; // Đường dẫn file cần ghi

        FileWriterThread writer1 = new FileWriterThread(filePath, "Thread 1 đang ghi...");
        FileWriterThread writer2 = new FileWriterThread(filePath, "Thread 2 đang ghi...");

        writer1.start();
        writer2.start();
    }
}
