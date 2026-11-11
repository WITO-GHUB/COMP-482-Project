import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/*
    arguments[] - input filename
    byte[] - array to store bytes
*/

public class Main {
    public static void main(String[] arguments) throws IOException {
        byte[] original = Files.readAllBytes(Path.of(arguments[0])); // Step 1, reads bytes
        byte[] compressed = HuffmanCompressor.compress(original); // Will call compress method within HuffmanCompressor class (NOT YET BUILT) to compress byte[] original
        Files.write(Path.of(arguments[1]), compressed); // Writes compressed bytes into new file 
    }
}