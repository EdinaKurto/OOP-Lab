package org.lab05.storageBoxes;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private double maxWeight;
    private List<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(ToBeStored item) {
        if (getWeight() + item.weight() <= maxWeight) {
            items.add(item);
        }
    }

    public double getWeight() {
        double totalWeight = 0;
        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + getWeight() + " kg";
    }
}

