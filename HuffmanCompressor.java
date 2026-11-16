import java.util.*;

import org.w3c.dom.Node;

/** 
 *  Compression class
 *  
 * Variables:
 * - byte[] stores the text / characters as a list in the order it appears as bytes, hence the type
 *      Each element is 1 byte stored as it's ASCII decimal code.
 *      Example: 'Hello' would be stored as H: data[0] = 72 , e: data[1] = 101, l: data[2] = 108, l: data[3] = 108, o: data[4] = 111
 * - Node root - Root node of the Huffman Tree
 * - String input - Input text that is to be compressed
 * - Map characterFrequencies - Map that stores a key char and a corresponding int of the number of times the char appears
 * - Map huffmanCodes - Map that stores a key char with the corresponding huffman code string of 0s and 1s

*/

public class HuffmanCompressor {

    private Node root;
    private String input;
    private Map<Character, Integer> characterFrequencies;
    private Map<Character, String> huffmanCodes;

    // Compression method
    public byte[] compress(String input) {
        this.input = input;
        writeCharFreqMap();
        huffmanCodes = new HashMap<>();
        return encodeBytes();
    }

    // writeCharFreqMap method
    private void writeCharFreqMap() {
        characterFrequencies = new HashMap<>(); // Creates new map
        for (char character : input.toCharArray()) { // For each char, turn the string into an arry of chars, loop puts each one into variable, character
            Integer integer = characterFrequencies.get(character); // Look up how many times character has been counted
            characterFrequencies.put(character, integer != null ? integer + 1 : 1); // Stores key and value into the characterFrequencies map, if integer does not = null, add 1 to the value, otherwise start at 1
        }
    }

    // Method to build the Huffman tree
    static Node buildTree(Map<Character, Integer> frequencies) {
        Queue<Node> queue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            queue.add(new Leaf(entry.getKey(), entry.getValue())); // Creates a leaf node for every char and its freq and adds it to a queue
        }

        while (queue.size() > 1) {
            queue.add(new Node(queue.poll(), queue.poll())); // Adds, then removes 2 smallest nodes, making them children of new parent, freq = sum, adds parent back to queue
        }

        return queue.poll(); // Returns laste node of queue, which is the root of completed tree
    }
}
