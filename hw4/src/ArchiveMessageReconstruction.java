
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Logan Gosch
 */

/**
 * Starts the program, takes input from user, and initiates MsgTree processes.
 */
public class ArchiveMessageReconstruction {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Please enter filename to decode: " );
        Scanner consoleInput = new Scanner(System.in);
        Scanner fileScanner = new Scanner(new File(consoleInput.next()));
        Scanner lineScanner = new Scanner(fileScanner.nextLine());
        lineScanner.useDelimiter("\n");

        StringBuilder encodeString = new StringBuilder();
        String msg;


        while (lineScanner.hasNext()) {
            encodeString.append(lineScanner.next());
        }
        // Get the second line in the file, will either be the message or a continuation of the encoding string
        lineScanner = new Scanner(fileScanner.nextLine());
        String secondLine = lineScanner.next();
        if (secondLine.contains("^")) {
            encodeString.append("\\n");
            encodeString.append(secondLine);
            lineScanner = new Scanner(fileScanner.nextLine());
            msg = lineScanner.next();
        } else {
            msg = secondLine;
        }

        System.out.println(encodeString);
        System.out.println(msg);

        MsgTree tree = new MsgTree(encodeString.toString());
//        MsgTree.printCodes(tree, "");
//        tree.decode(tree, msg);

        consoleInput.close();
        fileScanner.close();
        lineScanner.close();
    }
}
