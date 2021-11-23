package com.pb.voitovych.hw9;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Level ;

public class FileNumbers {

    private static final Logger LOGGER = Logger.getLogger(FileNumbers.class.getName()) ;

    public static void main(String[] args) throws Exception {
        System.setProperty("java.util.logging.config.file",
                "out/production/JavaHomeWork/com/pb/voitovych/hw9/logging.properties") ;
        LogManager.getLogManager().readConfiguration() ;

        FileNumbers fileNumbers = new FileNumbers() ;

        fileNumbers.createNumbersFile();
        fileNumbers.createOddNumbersFile();

    }


    public void createNumbersFile() {
        LOGGER.entering(getClass().getName(), "createNumbersFile") ;

        try (Writer writer = new FileWriter("src/com/pb/voitovych/hw9/number-file.txt")) {
            Random rnd = new Random() ;
            int x ;
            String s ;
            for (int i = 0; i < 10; i++) {
                s = "";
                for (int j = 0; j < 10; j++) {
                    x = rnd.nextInt(99)+1;
                    s = s.concat(String.valueOf(x)) ;
                    if (j < 9) s = s.concat(" ") ;
                }
                writer.write(s.concat("\n")) ;
            }

        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "I/O error createNumberFile!") ;
        }
        LOGGER.exiting(getClass().getName(), "createNumberFile");

    }

    public void createOddNumbersFile() {
        LOGGER.entering(getClass().getName(), "createOddNumbersFile") ;

        Path path0 = Paths.get("src/com/pb/voitovych/hw9/number-file.txt") ;

        try (Scanner scan = new Scanner(path0)){
            scan.useDelimiter("[ \n]") ;
            //System.out.println("DELIMITERS: "+ scan.delimiter().toString());
            try (Writer writer =
                         new FileWriter("src/com/pb/voitovych/hw9/number-odd-file.txt")) {
                int x;
                int j = 0;
                String s = "";
                while (scan.hasNext()) {
                //    System.out.println("scan x");
                    x = scan.nextInt();
                //    System.out.println("x = " + x);
                    if (x % 2 == 0) {
                        x = 0;
                    }
                    s = s.concat(String.valueOf(x));
                    j++;
                    if (j < 10) {
                        s = s.concat(" ");
                    } else {
                    //    System.out.println(s);
                        writer.write(s.concat("\n"));
                        s = "";
                        j = 0;
                    }
                }
            } catch (Exception ex) {
                LOGGER.log(Level.SEVERE,
                        "Can't write to NumberOddFile! : ") ;
            }

        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "I/O error createOddNumberFile!") ;
        }
        LOGGER.exiting(getClass().getName(), "createOddNumberFile");

    }
}
