package main.models;

import java.util.Map;
import java.util.TreeMap;

public class Custom_Set1<T extends Comparable> {
        private static final Object PRESENT = new Object();
        private TreeMap<T,Object> treeMap;


        public Custom_Set1() {
            this.treeMap = new TreeMap<T,Object>();
        }

        public boolean add(T item) {
            if (item == null) {
                throw new IllegalArgumentException();
            }
            return treeMap.put(item,PRESENT) == null;
        }

        public boolean contains(T item) {
            if (item == null) {
                throw new IllegalArgumentException();
            }
            return treeMap.containsKey(item);
        }

        public int getSize() {
            return treeMap.size();
        }

        public boolean remove(T item) {
            if (item == null) {
                throw new IllegalArgumentException();
            }
            if (treeMap.size() == 0) {
                return false;
            }
            return treeMap.remove(item) != null;
        }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (Map.Entry<T,Object> entry: treeMap.entrySet()) {
            output.append(entry.getKey().toString()).append(", ");
        }
        String outputString = output.toString();
        return outputString.substring(0,outputString.length()-2) + "]";
    }
}
