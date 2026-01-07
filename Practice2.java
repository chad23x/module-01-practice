import java.util.Scanner;

public class Practice2 {

    // instance variables/fields for Car method
    String color;
    boolean isRunning;
    int velocity;

    public void Car(String carColor, boolean carRunning, int milesPerHour) {
        // assign parameters to the fields
        color = carColor;
        isRunning = carRunning;
        velocity = milesPerHour;
    }

    public static int add(int n1, int n2) {
        int sum = n1 + n2; // use static when not creating an object
        return sum;
    }


    public static void main (String[] args) { // main method
    /*
    Classic  Hello world 
     */
    System.out.println("hello world");
    Scanner scan = new Scanner(System.in); // this is how you implement scanner object called scan
    System.out.println("input anything besides numbers");
    String word = scan.nextLine(); // scans the next line and puts whatever's scnaned into word
    System.out.println(word);

    /* 
    method invocation example
     */
    int result = 0;
    result = add(1, 2);
    System.out.println(result);

    /*
    the below invokation doesn't work. there's a red line under car.
    This is because "new" is used to invoke constructors only (meaning it
    will look for the consstructor under the name "Car" as well as a class
    under the name "Car". of course, there is no class or constructor named
    Car. You invoke methods using dot operator: ferrari.start. you invoke
    constructors using Car ferrari = new Car(arguments); also creating an object) 
    */
    Car ferrari = new Car("Blue", true, 50);
    System.out.println(ferrari);
    System.out.println(ferrari.isRunning);
    }



}

/*
All ways to invoke methods in Java: 

1. Constructor - Creates an object, invoked only with "new", like Car c = new Car();
(Name must = class name, no return type, can't be called like a method, runs once per object)
2. Instance method (non-static) - c.start(); or c.accelerate(10); so the form is objectReference.methodName(args);
(uses the objects fields, can be polymorphic/overriding)
3. Static method - Practice2.add(1, 2); or from inside the same class it would be add(1, 2);.
With static import: import static Practice2.add; add(1, 2);
(belongs to the class, not the object)
4. Special Cases - a) calling instance method from same class is methodName();
b) using "this" like this.methodName();
c) Using "super" like super.methodName();
d) lambda invokation like runnable r = () -> SYstem.out.println("hi"); r.run();

*/
