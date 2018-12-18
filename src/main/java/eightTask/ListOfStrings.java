package main.java.eightTask;

import java.util.List;



public class ListOfStrings {

    protected List<String> vardi;


    public ListOfStrings(List<String> forEachString) {
        this.vardi = forEachString;


    }

    public static void printTextLine(String printableText) {
        System.out.println(printableText);
    }

    public List<String> getVardi() {
        return this.vardi;

    }
}
