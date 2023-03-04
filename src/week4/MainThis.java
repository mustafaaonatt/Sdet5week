package week4;

public class MainThis {
    int instVar;
    //constructor with this
//    MainThis (int instVar){
//        this.instVar = instVar;
//        System.out.println("this reference : " + this.instVar);
//    }
    //constructor without this.
    MainThis(int instVar){
        instVar = instVar;
    }

    MainThis(){

    }

    public static void main(String[] args) {
        MainThis obj = new MainThis(15);
        System.out.println("object reference : " + obj.instVar);
    }
}
