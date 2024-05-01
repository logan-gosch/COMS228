/**
 * @author Logan Gosch
 */
public class MsgTree {
    /**\
     * Leaf node data, should be null for internal nodes
     */
    public char payloadChar;
    /**
     * Left node in the binary path
     */
    public MsgTree left;
    /**
     * Right node in the binary path
     */
    public MsgTree right;
    /**
     * Static integer to track the index of the encoding string, used for recursive tree building.
     */
    private static int staticCharInt = 0;

    public MsgTree(String encodeString) {
        staticCharInt++;
        // Base Case, with conditional recursive cases
        if (encodeString.charAt(staticCharInt) != '^') {
            // Tree Case - for no newline character and two leaf nodes siblings
            if (encodeString.charAt(staticCharInt + 1) != '^' && encodeString.charAt(staticCharInt + 1) != '\\') {
                left = new MsgTree(encodeString.charAt(staticCharInt));
                staticCharInt++;
                right = new MsgTree(encodeString.charAt(staticCharInt));
            }
            // Tree Case - for the newline character, with conditional handling for a leaf node sibling
            else if (encodeString.charAt(staticCharInt) == '\\') {
                if (staticCharInt < encodeString.length() - 1 && encodeString.charAt(staticCharInt + 1) == 'n') {
                    left = new MsgTree('\n');
                    staticCharInt += 2;
                    if (encodeString.charAt(staticCharInt) != '^') {
                        right = new MsgTree(encodeString.charAt(staticCharInt));
                    } else {
                        right = new MsgTree(encodeString);
                    }
                }
            }
            // Tree Case - for a single leaf node and internal node sibling.
            else {
                left = new MsgTree(encodeString.charAt(staticCharInt));
                right = new MsgTree(encodeString);
            }
        } else {
            left = new MsgTree(encodeString);
            right = new MsgTree(encodeString);
        }
    }

    public MsgTree(char payloadChar) {
        this.payloadChar = payloadChar;
    }

    public static void printCodes(MsgTree root, String code) {
        if (root.left == null && root.right == null) {
            System.out.printf("character: %c, code: %s\n--------------------", root.payloadChar + " " + code);
        } else {
            printCodes(root.left, code + "0");
            printCodes(root.right, code + "1");
        }
    }

    public void decode(MsgTree codes, String msg) {
        System.out.println("MESSAGE:");


    }
}
