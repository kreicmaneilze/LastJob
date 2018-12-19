package main.java.eightTask;

import java.util.ArrayList;
import java.util.List;

public class ListOfInteger {

    private final List<Integer> items;

    public ListOfInteger() {
        this.items = new ArrayList<>();
    }

    public ListOfInteger(List<Integer> items) {
        this.items = items;
    }

    public void add(int item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
