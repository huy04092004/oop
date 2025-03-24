import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CharacterCountThread {
    static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    static class CharacterCounter extends Thread {
        private String source;

        public CharacterCounter(String source) {
            this.source = source;
        }

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new FileReader(source))) {
                int charCount = 0;
                int ch;
                while ((ch = br.read()) != -1) {
                    if (!Character.isWhitespace(ch)) {

                            charCount++;
                        }
                }

                queue.put(charCount); // Đưa số ký tự vào BlockingQueue
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class ResultWriter extends Thread {
        private String destination;

        public ResultWriter(String destination) {
            this.destination = destination;
        }

        @Override
        public void run() {
            try (FileWriter fw = new FileWriter(destination)) {
                int charCount = queue.take(); // Nhận kết quả từ BlockingQueue
                fw.write("Số ký tự trong file: " + charCount);
                System.out.println("Kết quả đã được ghi vào " + destination);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "log.txt";

        CharacterCounter counter = new CharacterCounter(inputFile);
        ResultWriter writer = new ResultWriter(outputFile);

        counter.start();
        writer.start();
    }
}
