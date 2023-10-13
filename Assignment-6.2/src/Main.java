
public class Main {
    public static void main(String[] args) {
        // Create two Person objects with different information
        Person person1 = new Person("Harsh", 30, "Urmi circle");
        Person person2 = new Person("Akshar", 25, "Alkapuri");


        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());

        System.out.println("\nPerson 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());

        // Change the address of person2
        person2.setAddress("House of fun");

        System.out.println("\nUpdated information for Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());
    }
}
