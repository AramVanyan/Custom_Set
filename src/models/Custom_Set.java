package models;

import java.util.TreeMap;

public class Custom_Set<T> {

        private static final Object PRESENT = new Object();
        private TreeMap<T,Object> treeMap;

        public Custom_Set() {
            this.treeMap = new TreeMap<>();
        }

        public boolean add(T item) {
            return treeMap.put(item,PRESENT) == null;
        }
        public boolean contains(T item) {
            return treeMap.containsKey(item);
        }
        public int getSize() {
            return treeMap.size();
        }
        public boolean remove(T item) {
            return treeMap.remove(item) == null;
        }



}
