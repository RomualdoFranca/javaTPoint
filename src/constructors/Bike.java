package constructors;

//Java Program to create and call a default constructor

/*
    Constructor name must be the same as its class name
    A Constructor must have no explicit return type
    A Java constructor cannot be abstract, static, final, and synchronized
*/
public class Bike {
    //creating a default constructor
    //  no-arg constructor in the Bike class
    //The default constructor is used to provide the default values to the object
    // like 0, null, etc., depending on the type.
    Bike() {
        System.out.println("Bike is created");
    }

    // main method
    public static void main(String[] args) {
    //calling a default constructor
        Bike b = new Bike();

    }
}

