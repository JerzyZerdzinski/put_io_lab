// File: 04-git/Person.java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        // Added a comment for clarity
    }

    public String getName() {
        return name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }   

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }   
    // Method to display a greeting message
}
// Zmiana do schowaka