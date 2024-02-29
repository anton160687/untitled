package org.example;
import java.util.ArrayList;

public class CustomHashSet {
    private ArrayList<Integer> elements;

    public CustomHashSet() {
        elements = new ArrayList<>();
    }

    public void add(Integer element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public Integer get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i));
            if (i < elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomHashSet customSet = new CustomHashSet();

        customSet.add(10);
        customSet.add(20);
        customSet.add(30);

        System.out.println("Set elements: " + customSet.toString());

        System.out.println("Element at index 1: " + customSet.get(1));
    }
}