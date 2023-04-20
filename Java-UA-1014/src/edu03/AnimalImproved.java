/**
 * A simple class example without using encapsulation.
 * This example is not practical or good, it is provided only for demonstration.
 */
package edu03;

public class AnimalImproved {
    public String breed;
    public String name;
    public double age;
    public static int count = 0;

    /**
     * Non-static counter, you can try a static one and see what happens
     */ {
        count++;
    }

    /**
     * Parameterized constructor
     *
     * @param breed
     * @param name
     * @param age
     */
    public AnimalImproved(String breed, String name, double age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public void jump() {
        System.out.println("I can jump");
    }

    public static void main(String[] args) {

        //Animal1 cat = new Animal1(); //Here will be an error because
        // we cannot create like this without a default constructor.

        AnimalImproved cat = new AnimalImproved("Cat", "Tom", 1.1);
        AnimalImproved dog = new AnimalImproved("Dog", "Jack", 5);
        AnimalImproved raccoon = new AnimalImproved("Raccoon", "Rocket", 1.5);

        System.out.println("We created " + cat.breed + ", " + dog.breed + ", " + raccoon.breed);
        System.out.println("We have " + count + " animals.");
        cat.jump();
        dog.jump();

    }
}
