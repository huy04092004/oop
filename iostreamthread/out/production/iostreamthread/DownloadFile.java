import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;

class DownloadThread extends Thread {
    private String url;
    private String filePath;

    public DownloadThread(String url, String filePath) {
        this.url = url;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            System.out.println(" Đang tải nội dung từ: " + url);
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }

            System.out.println(" Đã lưu nội dung vào: " + filePath);
        } catch (Exception e) {
            System.err.println(" Lỗi khi tải nội dung: " + e.getMessage());
        }
    }
}

public class DownloadFile {
    public static void main(String[] args) {
        String url = "https://www.example.com"; // Thay URL cần tải
        String filePath = "log.txt"; // Tên file lưu kết quả

        DownloadThread downloader = new DownloadThread(url, filePath);
        downloader.start();
    }
}
