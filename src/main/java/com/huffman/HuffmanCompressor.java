import java.util.*;

/** 
 *  Compression class
 *  
 * Variables:
 *  - byte[] data stores the text / characters as a list in the order it appears as bytes, hence the type
 *      Each element is 1 byte stored as a number.
 *      example: 'Hello' would be stored as data[0] = 72 , data[1] = 101, data[2] = 101, data[3] = 108, data[4] = 111
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