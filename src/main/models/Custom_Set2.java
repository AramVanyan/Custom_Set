package main.models;

public class Custom_Set2 <T extends Comparable> {
    private Node root;
     class Node {
        T data;
        Node left;
        Node right;
        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
     }
    public boolean add(T item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        root = add(root,item);
        return true;
    }

    private Node add(Node root,T item) {
        if (root == null) {
            root = new Node(item);
            return root;
        }
        if (root.data.compareTo(item) > 0) {
            root.left = add(root.left,item);
        }
        else if (root.data.compareTo(item) < 0) {
            root.right = add(root.right,item);
        }
        return root;
    }
    public boolean contains(T item) {
         if (item == null) {
             throw new IllegalArgumentException();
         }
         return isFound(root,item);

    }
    private boolean isFound(Node root, T item) {
         boolean isFound = false;
         if (root == null) {
             return false;
         }
         if (root.data.equals(item)) {
             return isFound = true;
         }
         if (root.data.compareTo(item) > 0) {
             isFound = isFound(root.left,item);
         }
         else {
             isFound = isFound(root.right,item);
         }
         return isFound;
    }
    public boolean remove(T item) {
         if (item == null) {
             throw new IllegalArgumentException();
         }
         if (isFound(root,item)) {
             remove(root,item);
             return true;
         }
         return false;
    }
    private Node remove(Node root, T item) {
         if (root == null) {
             return root;
         }
         if (root.data.compareTo(item) > 0) {
             root.left = remove(root.left,item) ;
         }
         else if (root.data.compareTo(item) < 0) {
             root.right = remove(root.right,item);
         }
         else {
             if (root.left == null)
                 return root.right;
             else if (root.right == null)
                 return root.left;

             root.data = minValue(root.right);
             root.right = remove(root.right,root.data);

         }
         return root;
    }

    T minValue(Node root)
    {
        T minValue = root.data;
        while (root.left != null)
        {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }







    public int getSize() {
         return size(root);
    }

    private int size(Node node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }

    @Override
    public String toString() {
         String output = printTreeInOrder(root);
         return "[" + output.substring(0,output.length() - 2) + "]" ;
    }

    private String printTreeInOrder(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        if (root == null) {
            return stringBuilder.toString();
        }
        stringBuilder.append(printTreeInOrder(root.left));
        stringBuilder.append(root.data).append(", ");
        stringBuilder.append(printTreeInOrder(root.right));


        return stringBuilder.toString();
    }
}
