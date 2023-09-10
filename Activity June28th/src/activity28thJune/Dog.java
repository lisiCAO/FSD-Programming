/**
 * The `Dog` class represents a dog with a name and breed.
 * 
 * This class provides methods to set and retrieve the name and breed of the dog.
 * It also overrides the `equals`, `hashCode`, and `toString` methods for proper object comparison and representation.
 * 
 * @author Lisi Cao
 * @version 2.0
 * @since September 10, 2023
 */


package activity28thJune;

import java.util.Objects;

/**
 * Represents a Dog with attributes for name and breed.
 */
public class Dog {

    private String name;   // The name of the dog.
    private String breed;  // The breed of the dog.

    /**
     * Private default constructor to prevent the creation of Dog objects without specifying name and breed.
     */
    @SuppressWarnings("unused")
	private Dog() {
    }

    /**
     * Initializes a new Dog object with specified name and breed.
     *
     * @param name  The name of the dog.
     * @param breed The breed of the dog.
     */
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    /**
     * Returns the name of the dog.
     *
     * @return The name of the dog.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the breed of the dog.
     *
     * @return The breed of the dog.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the name of the dog.
     *
     * @param name The new name for the dog.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the breed of the dog.
     *
     * @param breed The new breed for the dog.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog other = (Dog) obj;
        return Objects.equals(breed, other.breed);
    }

    @Override
    public String toString() {
        return name + " - " + breed;
    }

    /**
     * The entry point for the application. It tests the functionality of the Dog class.
     *
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        // Create dog instances
        Dog dog1 = new Dog("dog1", "breed1");
        Dog dog2 = new Dog("dog2", "breed2");

        // Modify the attributes using setter methods
        dog1.setName("Buddy");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Rex");
        dog2.setBreed("German Shepherd");

        // Print the updated values
        System.out.println("Dog 1 : " + dog1 + "\n" + "Dog 2: " + dog2);

        // Create an array and add both dogs
        Dog[] dogs = {dog1, dog2};

        // Compares dogs' breed
        if (dogs.length >= 2) {
        	
            int indexFirstDog = 0;
            int indexSecondDog = 1;
            
            System.out.println(dogs[indexFirstDog].getName() + " and " + dogs[indexSecondDog].getName() + " are"
                    + (dogs[indexFirstDog].equals(dogs[indexSecondDog]) ? " " : " not ") + "the same breed.");
        }
    }
}

