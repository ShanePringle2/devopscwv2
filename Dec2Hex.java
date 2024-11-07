
import java.util.logging.Logger;
// test to see if i fixed file strucutre issue

public class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args) {
        if (args.length == 0) {
            logger.severe("Error: No input provided.");
            return;
        }
        
        try {
            int input = Integer.parseInt(args[0]);
            logger.info("Hexadecimal: " + Integer.toHexString(input));
        } catch (NumberFormatException e) {
            logger.severe("Error: Input is not an integer.");
        }
    }
}



