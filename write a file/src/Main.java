import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filepath = "C:\\Users\\shaqg\\Desktop\\test.txt";
        String textContent = """
                hello world
                testing
                12345
                wiiee woo
                """;

        try (FileWriter Writer = new FileWriter(filepath)){
            Writer.write(textContent);
            System.out.println("file has been written");
        }
        catch (FileNotFoundException e) {
            System.out.println("could not locate file location");
        }
        catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}
