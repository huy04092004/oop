import java.io.*;

class FileCopyThread extends Thread {
    private String sourceFile;
    private String destinationFile;

    public FileCopyThread(String sourceFile, String destinationFile) {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
                System.out.println(Thread.currentThread().getName() + " sao chép: " + line);
                Thread.sleep(500); // Tạm dừng 0.5 giây để mô phỏng quá trình sao chép
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi sao chép file: " + e.getMessage());
        }
    }
}

public class FileCopyWithThread {
    public static void main(String[] args) {
        String sourceFile = "test.txt"; // Đường dẫn file nguồn
        String destinationFile = "test1.txt"; // Đường dẫn file đích

        FileCopyThread copyThread = new FileCopyThread(sourceFile, destinationFile);
        copyThread.start();
    }
}
