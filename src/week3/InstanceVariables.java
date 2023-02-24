package week3;

public class InstanceVariables {
    public int a = 20; // Instance variable or Global variable : Outside of any methods but inside the class.
    public static int c; // Instance or Global variable.
    public float pi = 3.14f; // Instance or Global Variable.
    double d = 76.22d; // Instance or Global Variable.

    /**
     * 1- Local Variable
     * 2- Instance Variable or Global Variable
     * 3- Static Variable
     */

    /*
        2. Instance Variables
        Instance variables are non-static variables and are declared IN A CLASS but outside
        of any method, constructor, or block.

        As instance variables are declared in a class, these variables are created
        when an object of the class is created and destroyed when the object is destroyed.
//        InstanceVariables iObj = new InstanceVariables();

        Unlike local variables, we may use access specifiers for instance variables. --> public, private, default, protected

        If we do not specify any access specifier, then the default access specifier will be used.
        Initialization of an instance variable is not mandatory. Its default value is 0.
        Instance variables can be accessed only by creating objects.

     */
    public static void main(String[] args) {
        int a = 15; // Local variable
        double dNumber = 5.5; //Local variable

    }

    public void test(){
        int x = 45;// Local variable
        System.out.println(x);
    }

    //Code block or Scope
    {
        int number = 55; // Local variable

    }

}
