package week4;

public class Test {
    static int i;
    int j;

    //static block:
    static{
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Constructor called ");
    }

}
