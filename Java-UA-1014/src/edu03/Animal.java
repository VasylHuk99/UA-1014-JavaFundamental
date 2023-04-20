package edu03;

/**
 * A simple class example without using encapsulation.
 * This example is not practical or good, it is provided only for demonstration.
 */
public class Animal {
    /**
     * Here you can see only the class fields without methods.
     */
    public String breed;
    public String name;
    public double age;

    /**
     * The default constructor is explicitly absent,
     * but it exists, even if you don't see it.
     */
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.breed = "Cat";
        cat.name = "Rocket";
        cat.age = 1.1;

        System.out.println("We created "+ cat.breed + ".");
        System.out.println("His name is "+cat.name + ".");
        System.out.println("His age is "+cat.age + ".");

    }
}
