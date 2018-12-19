package main.java.eightTask;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {

    private final List<String> items;

    public ListOfStrings() {
        this.items = new ArrayList<>();
    }

    public ListOfStrings(List<String> items) {
        this.items = items;
    }

    public void add(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }
}