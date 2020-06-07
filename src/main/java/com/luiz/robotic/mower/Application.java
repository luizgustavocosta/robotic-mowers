package com.luiz.robotic.mower;

import com.luiz.robotic.mower.actions.RoboticMowerMovement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The type Application.
 */
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    /**
     * The entry point of application.
     *
     * @param arguments the input arguments
     */
    public static void main(String... arguments) {
        logger.info("Welcome to Robotic Mowers by Luiz Costa");
        execute();
    }

    private static void help() {
        logger.info("This is how introduce the data");
        logger.info("The first of input is the upper-right coordinates of plateau, for instance");
        logger.info("5 5");
        logger.info("Once set the coordinates proceed with the instructions");
        logger.info("The first line give's the mower position");
        logger.info("1 2 N");
        logger.info("The second line is a series of instructions telling to mower explore the plateau");
        logger.info("LMLMLMLMM");
        logger.info("Hit twice on <Enter> button");
        logger.info("The output should be");
        logger.info("1 3 N");
        logger.info("Press the <Enter> key to start or exit to close the program");
    }

    /**
     * Execute.
     */
    public static void execute() {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Type help for robotic mower introduction or press the <Enter> key to start");
            final String nextLine = scanner.nextLine();
            if (nextLine.contains("help")) {
                help();
                final String afterHelp = scanner.nextLine();
                if ("exit".equalsIgnoreCase(afterHelp)) {
                    logger.info("Good bye");
                    System.exit(1);
                }
            }
            List<String> mowerResponse = new ArrayList<>();
            String plateauCoordinates = scanner.nextLine();
            RoboticMowerMovement mowerMovement = new RoboticMowerMovement(plateauCoordinates);
            while (true) {
                String position = scanner.nextLine();
                if ("".equals(position)) {
                    break;
                }
                String movements = scanner.nextLine();
                if ("".equals(movements)) {
                    break;
                }
                mowerResponse.add(mowerMovement.move(position, movements));
            }
            mowerResponse.forEach(logger::info);
        }
        logger.info("End of program");
    }
}
