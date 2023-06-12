import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            LocalDateTime dataTime = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

            String newFormat = dataTime.format(format);
            System.out.println(newFormat);

            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
                break;
            }
        }
    }
}