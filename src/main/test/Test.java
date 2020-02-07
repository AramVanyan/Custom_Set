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

        //checking functionality of Custom_Set2 object
        Custom_Set2<Student> setOfStudents1 = new Custom_Set2<>();

        setOfStudents1.add( new Student("Aram", "Vanyan", 20));
        setOfStudents1.add( new Student("Tigran", "Yengibarov", 21));
        setOfStudents1.add( new Student("Tigran", "Hakobyan", 20));
        setOfStudents1.add( new Student("Tigran", "Barseghyan", 20));
        setOfStudents1.add( new Student("Suren", "Surenyan", 19));
        setOfStudents1.add( new Student("Suren", "Surenyan", 19));


        System.out.println(setOfStudents1);
        System.out.println(setOfStudents1.getSize());


        System.out.println(setOfStudents1.remove(new Student("Suren", "Surenyan", 19)));
        System.out.println(setOfStudents1.remove(new Student("Tigran", "Yengibarov", 21)));
        System.out.println(setOfStudents1.remove(new Student("Aram", "Vanyan", 20)));
        System.out.println(setOfStudents1.remove(new Student("Tigran", "Barseghyan", 20)));


        System.out.println(setOfStudents1.contains(new Student("Tigran", "Barseghyan", 20)));
        System.out.println(setOfStudents1.contains(new Student("Tigran", "Hakobyan", 20)));
        System.out.println(setOfStudents1.getSize());
        System.out.println(setOfStudents1);
        //checking functionality of Custom_Set2 object

        //checking functionality of Custom_Set1
        for (int i = 0; i < glasses.length; i++) {
            setOfGlasses.add(glasses[i]);
        }
        for (Coffee coffee : coffees) {
            setOfCoffees.add(coffee);
        }
        for (Student student : students) {
            setOfStudents.add(student);
        }

        //printing sets
        System.out.println(setOfCoffees);
        System.out.println(setOfGlasses);
        System.out.println(setOfStudents);
        //printing sets
        System.out.println();

        //testing of functions
        System.out.println(setOfStudents.contains(new Student("Aram", "Vanyan", 20)));
        System.out.println(setOfStudents.remove(new Student("Aram","Vanyan",20)));
        System.out.println(setOfStudents.remove(new Student("Aram","Vanyan",20)));
        System.out.println(setOfStudents.remove(new Student("Vardan","Ohanyan",26)));
        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
        System.out.println(setOfStudents.remove(new Student("Tigran", "Vardanyan", 23)));
        System.out.println(setOfStudents.getSize());
        //testing of functions

    }
}
