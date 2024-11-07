import java.io.IOException;
import java.util.logging.*;

//Adding123 this in to have something to push for video

public class Dec2Hex {
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("dec2hex.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.severe("Error: Unable to set up file handler for logging.");
            return;
        }

        if (args.length == 0) {
            logger.severe("Error: No input provided.");
            return;
        }

        try {
            int input = Integer.parseInt(args[0]);
            String hexString = Integer.toHexString(input);
            logger.info(String.format("Hexadecimal: %s", hexString));
        } catch (NumberFormatException e) {
            logger.severe("Error: Input is not an integer.");
        }
    }
}

