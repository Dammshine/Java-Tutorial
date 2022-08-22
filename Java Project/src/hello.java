// import java.math.BigInteger;
import java.util.Scanner;

public class hello {
    // Method: Every program need a public method called main
    // Static: OOP, create instance of class
    //         means not have to create a object??
    // Arguments: 
    public static void main(String[] args) {
        /* System.out.println("What is your name?");

        // Getting input, java get packages
        Scanner scanner = new Scanner(System.in);
        int name = (int)scanner.nextDouble();
        scanner.close();

        System.out.println("Hello " + name);

        // String constructor
        String string = new String("This is a string");
        System.out.println(string); */

        // Variable
        int x;           // Primitive
        Integer i = 2222;   // Object 
        final int Y = 1; // Constant
        System.out.println(Math.sqrt(-1));
        System.out.println(Double.isNaN(Math.sqrt(-1)));
        System.out.println(Math.pow(999, -999999));
    }

    public void tacos() {
        System.out.println("Hello taco!");
    }

    // Property 
    String x = new String("Hello");
}

// Class - Contains everything, has members
//   - Methods
//       - Statement
//       - Arguments
//       - Parameters, palceholder for argument (part of definition)
//   - Property
//   - Class have to have a main function, and the code will get automatically
//     executed. 

// Data type - the type for variable. How computer intepret data
//   - Primitive types
//       - boolean
//       - char, 
//       - byte, short, int, long
//       - float, double
//   - Object (struct, object in JS, dictionary in py)
//       - Instance of a class
//   - Final  (constant) 
//   - Statically typed, all variable need type
//       - Dynamically typed, JS, Python

// Literal  - The value, can be used as argument
// Variable - Store some value
// Expression - Evaluate to a value
// Operator   - work on operands to produce a value
// Operand    - The thing(s) operator works on

// Packages - All java code get packageed
//   - Avoid name conflict
//       - Fuly qualified the name, by typing the full name

// Access modifer (Public)
// Static - No instance of class is needed
// Not-static 
//   - Scanner is a non-static, that means you have to create an instance in order to use
// Object - Instance of a class
