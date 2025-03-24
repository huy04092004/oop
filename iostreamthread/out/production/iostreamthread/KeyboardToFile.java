import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class KeyboardWriterThread extends Thread {
    private String filePath;

    public KeyboardWriterThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {

            System.out.println("Nhập nội dung (gõ 'exit' để thoát):");

            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Dừng ghi file...");
                    break;
                }
                writer.write(input);
                writer.newLine();
                writer.flush(); // Đảm bảo dữ liệu được ghi ngay lập tức
                System.out.println("Đã ghi: " + input);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}

public class KeyboardToFile {
    public static void main(String[] args) {
        String filePath = "input.txt"; // File để lưu dữ liệu
        KeyboardWriterThread writerThread = new KeyboardWriterThread(filePath);
        writerThread.start();
    }
}
