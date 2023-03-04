package week4;

public class ThisKeyword {
    String name;


    //setter method
    void setName(String name){
        this.name = name;
    }
    //getter method
    String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();

        //calling the getter and setter method
        obj.setName("Adam");
        System.out.println("obj name : " + obj.getName());


    }
}
