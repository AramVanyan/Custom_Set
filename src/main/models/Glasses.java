package main.models;

import java.util.Objects;

public class Glasses implements Comparable<Glasses> {
    private String frameType;
    private String color;
    private int price;

    public Glasses(String frameType, String color, int price) {
        this.frameType = frameType;
        this.color = color;
        this.price = price;
    }

    public String getFrameType() {
        return frameType;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Glasses glasses) {
        return this.price - glasses.price;
    }

    @Override
    public String toString() {
        return frameType + " " + "glasses";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return price == glasses.price &&
                Objects.equals(frameType, glasses.frameType) &&
                Objects.equals(color, glasses.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameType, color, price);
    }
}