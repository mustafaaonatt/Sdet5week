package week4;

public class JavaExample {
    //static variables(belongs to class)
    static int i = 100;
    static String s = "Beginnersbook";
    //instance variables(belongs to object)
    String name = "Ahmet";

    //static method
    static void display(){
    //We can only call static variables from static methods.
        System.out.println("i : " + i);
        System.out.println("s : " + s);
    }

    //non-static method
    void funcn(){
        //static methods can call in static methods
        display();
    }
    //static main method
    public static void main(String[] args) {
        System.out.println("i : " + i);
        System.out.println("s : " + s);

        //create an object from JavaExample class.
        JavaExample javaExample = new JavaExample();

        //we are calling an instance variable through the object
        System.out.println(javaExample.name);
// we need to call non-static methods through the object
        javaExample.funcn();

        display(); // we can call static methods directly from static methods.

//funcn(); --> we can not call non-static methods from static methods.

    }
}
