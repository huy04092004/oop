import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class LogWriterThread extends Thread {
    private String logFilePath;
    private String message;

    public LogWriterThread(String logFilePath, String message) {
        this.logFilePath = logFilePath;
        this.message = message;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {
            for (int i = 0; i < 5; i++) { // Ghi 5 dòng log
                String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                String logEntry = timeStamp + " - " + message;

                writer.write(logEntry);
                writer.newLine();

                System.out.println("Đã ghi log: " + logEntry);

                Thread.sleep(2000); // Chờ 2 giây trước khi ghi log tiếp theo
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi ghi log: " + e.getMessage());
        }
    }
}

public class LogWriterApp {
    public static void main(String[] args) {
        String logFilePath = "log.txt"; // File log

        LogWriterThread logThread = new LogWriterThread(logFilePath, "Hệ thống đang chạy...");
        logThread.start();
    }
}
