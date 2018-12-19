package main.masterlogic;


import main.java.constants.ImportantConstants;
import main.java.eightTask.ListOfInteger;
import main.java.eightTask.ListOfStrings;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import static sun.tools.java.Constants.COMMA;
//import static sun.tools.java.Constants.SEMICOLON;


public class ProjectCentralProcessor {
    private String FailaNosaukums = "textData.txt";
    private char findLargest;
    private boolean LargestFromTextFile;


    public void executeprojectCentralProcessor() {
        failaNosaukumaIzsauksana();
        readFileInformation();
        //calculationClass();
        findLargest();

    }
    

    public String failaNosaukumaIzsauksana() {
        return FailaNosaukums;
    }

    public void findLargest() {

    }



    private void readFileInformation() {
        String projectDirectoryFullPath = System.getProperty("user.dir");
        String pathToCurrentProjectTextFilePackage = "/src/main/data/";
        String FailaNosaukums = "textData.txt";
//        Vardi vardi = new Vardi();
//        Cipari cipari = new Cipari();

        StringBuilder VarduBuilder = new StringBuilder();

        //List<Integer> = new ArrayList<>();
        
        ListOfStrings vardi = new ListOfStrings();
        ListOfInteger cipari = new ListOfInteger();
        
        List<Integer> separators = new ArrayList<>();
        separators.add(ImportantConstants.COMMA);
        separators.add(ImportantConstants.LINE_FEED);
        separators.add(ImportantConstants.SEMICOLON);
        separators.add(ImportantConstants.SPACE);

        try {
            FileReader fr = new FileReader(projectDirectoryFullPath + pathToCurrentProjectTextFilePackage + FailaNosaukums);

            int current;
            while ((current = fr.read()) != -1) {

                if (Character.isDigit(current)) {

                    // if number -> push to list
                    cipari.add(Character.getNumericValue(current));

                } else if (!separators.contains(current)) {

                    // if letter -> append to current word
                    VarduBuilder.append((char) current);

                } else {

                    // create word from previous chars
                    final String word = VarduBuilder.toString();

                    // create new build for next word
                    VarduBuilder.setLength(0);

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
            System.out.println(vardi.getItems().toString());
            System.out.println(cipari.getItems().toString());
           // System.out.println(findLargest);
            System.out.println(new calculationClass(findLargest));


        }
    }


    }









