package main.masterlogic;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//import static sun.tools.java.Constants.COMMA;
//import static sun.tools.java.Constants.SEMICOLON;


public class ProjectCentralProcessor {
    private String FailaNosaukums = "textData.txt";


    public void executeprojectCentralProcessor() {
        failaNosaukumaIzsauksana();
        readFileInformation();
        new calculationClass();

    }
    public String failaNosaukumaIzsauksana() {
        return FailaNosaukums;
    }


    private void readFileInformation() {
        String projectDirectoryFullPath = System.getProperty("user.dir");
        String pathToCurrentProjectTextFilePackage = "/src/main/data/";
        String FailaNosaukums = "textData.txt";
//        Vardi vardi = new Vardi();
//        Cipari cipari = new Cipari();

        StringBuilder VarduBuilder = new StringBuilder();

        List<String> vardi = new ArrayList<>();
        List<Integer> cipari = new ArrayList<>();

        try {
            FileReader fr = new FileReader(projectDirectoryFullPath + pathToCurrentProjectTextFilePackage + FailaNosaukums);

            int current;
            while ((current = fr.read()) != -1) {

                if (Character.isDigit(current)) {

                    // if number -> push to list
                    cipari.add(Character.getNumericValue(current));

                } else if (Character.isLetter(current)) {

                    // if letter -> append to current word
                    VarduBuilder.append((char) current);

                } else {

                    // create word from previous chars
                    final String word = VarduBuilder.toString();

                    // create new build for next word
                    VarduBuilder = new StringBuilder();

                    // ignore whitespaces
                    if (word.length() > 0) {
                        vardi.add(word);
                    }
                }
            }

            fr.close();
        } catch (
                IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("This is what comes out: ");
            //System.out.println(vardi.getVardi);
            System.out.println(cipari);
            System.out.println(vardi);
           // System.out.println(longestWord);


        }
    }


    }









