import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] arguments) throws IOException {
        byte[] original = Files.readAllBytes(Path.of(arguments[0]))
    }
}