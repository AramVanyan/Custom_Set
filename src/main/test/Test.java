package main.test;

import main.models.*;


public class Test {
    public static void main(String[] args) {
        Glasses[] glasses = new Glasses[]{
                new Glasses("full frame", "red", 75),
                new Glasses("semi-rimless", "green", 105),
                new Glasses("rimless", "black", 40),
        };
        Student[] students = new Student[]{
                new Student("Aram", "Vanyan", 20),
                new Student("Tigran", "Vardanyan", 23),
                new Student("Vardan", "Ohanyan", 26),
        };
        Coffee[] coffees = new Coffee[]{
                new Coffee("Cappuccino", 3),
                new Coffee("Espresso", 5),
                new Coffee("Macchiato", 13)
        };
        Custom_Set1<Glasses> setOfGlasses = new Custom_Set1<Glasses>();
        Custom_Set1<Coffee> setOfCoffees = new Custom_Set1<Coffee>();
        Custom_Set1<Student> setOfStudents = new Custom_Set1<Student>();

        Custom_Set2<Student> setOfStudents1 = new Custom_Set2<>();
        setOfStudents1.add( new Student("Aram", "Vanyan", 20));
        setOfStudents1.add( new Student("Tiko", "Yengibarov", 21));
        setOfStudents1.add( new Student("Tiko", "Cherry", 20));
        setOfStudents1.add( new Student("Tiko", "Barseghyan", 20));
        setOfStudents1.add( new Student("Suren", "Surenyan", 19));
        setOfStudents1.add( new Student("Suren", "Surenyan", 19));
        System.out.println(setOfStudents1);
        System.out.println(setOfStudents1.contains(new Student("Tiko", "Cherry", 20)));
        System.out.println(setOfStudents1.getSize());
        setOfStudents1.remove(new Student("Tiko", "Cherry", 20));
        System.out.println(setOfStudents1.remove(new Student("Aram", "Vanyan", 20)));
        System.out.println(setOfStudents1);
        System.out.println(setOfStudents1.contains(new Student("Aram", "Vanyan", 20)));
        setOfStudents1.add(new Student("Aram", "Vanyan", 20));
        System.out.println(setOfStudents1);

        //initialization of custom sets
        for (int i = 0; i < glasses.length; i++) {
            setOfGlasses.add(glasses[i]);
        }
        for (Coffee coffee : coffees) {
            setOfCoffees.add(coffee);
        }
        for (Student student : students) {
            setOfStudents.add(student);
        }
        //initializing of custom sets

        //printing sets
//        System.out.println(setOfCoffees);
//        System.out.println(setOfGlasses);
//        System.out.println(setOfStudents);
        //printing sets
        System.out.println();

        //testing of functions
//        System.out.println(setOfStudents.add(new Student("Vahe","Gharibyan",50)));
//        System.out.println(setOfStudents.contains(new Student("Aram", "Vanyan", 20)));
//        System.out.println(setOfStudents.remove(new Student("Aram","Vanyan",20)));
//        System.out.println(setOfStudents.remove(new Student("Aram","Vanyan",20)));
//        System.out.println(setOfStudents.remove(new Student("Vardan","Ohanyan",26)));
//        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
//        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
//        System.out.println(setOfStudents.add(new Student("Tigran", "Vardanyan", 23)));
//        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
//        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
//        System.out.println(setOfStudents.getSize());
        //testing of functions

    }
}
