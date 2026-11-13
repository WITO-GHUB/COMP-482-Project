import java.util.*;

/** 
 *  Compression class
 *  
 * Variables:
 *  - byte[] data stores the text / characters as a list in the order it appears as bytes, hence the type
 *      Each element is 1 byte stored as it's ASCII decimal code.
 *      Example: 'Hello' would be stored as H: data[0] = 72 , e: data[1] = 101, l: data[2] = 108, l: data[3] = 108, o: data[4] = 111
 *
*/

public class HuffmanCompressor {

    // Compression method
    public static byte[] compress(byte[] data) {
        int[] frequency = countFrequency(data);
    }

    // countFrequency method
    public static int[] countFrequency(byte[] data) {
        int[] frequency = new int[]
    }
}
