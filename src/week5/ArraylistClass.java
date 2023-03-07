package week5;

import java.util.*;

public class ArraylistClass {
    public static void main(String[] args) {
        // Declare the ArrayList as below:
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        List<String> list3 = new ArrayList<>() ;
//        ArrayList<String> list4 = new List<>();  ---> Doesn't compile
        List<String> list5 = new ArrayList<>();

        System.out.println(list5);

        ArrayList<String> birds = new ArrayList<>();

        // birds.add("Hawk"); ---> adding the element to ArrayList
        birds.add("Hawk");
        System.out.println(birds);
        birds.add("Test");
        birds.add(1, "Robin");
        birds.add(0, "Blue jay");
        birds.add("Cardinal");
        System.out.println(birds);

        // birds.remove()   ---> Remove the element from ArrayList
        // remove() method is boolean type that's why if there is no such an element in the ArrayList it's going to return false
        // if there is such an element the remove method can remove and return true.
        System.out.println(birds.remove("Fox"));  //--> return false
        System.out.println(birds.remove("Robin")); // --> return true
        System.out.println("After removing the \"Robin\" element : " + birds);

        System.out.println("Removed the " +  birds.remove(2) + " from the birds Arraylist which has index number 2 ");

        System.out.println(birds.remove(1));
        // --> if we put 10, 15 or bigger numbers in remove method we will get an error(IndexOutOfBounds exception).

        // size() and set() Methods as below. set() method is replacing the element's value
        System.out.println(birds.size());
        birds.set(1, "Welcome to Java");
        System.out.println(birds.get(0));

//        Contains() method.
        System.out.println(birds.size());
        System.out.println(birds.contains("The Birth"));
        System.out.println(birds.contains("Welcome to Java"));

        // Sort methods :
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Y");
        arrList.add("A");
        arrList.add("H"); //---> [M,O,z]
        Collections.sort(arrList); // --> sorting the arrList
        System.out.println(arrList);

        // equals method
        ArrayList<String> arrList2 = new ArrayList<>();
        arrList.add("a");
        arrList2.add("b");
        arrList.add("c");
        arrList2.add("c");
        System.out.println("The original arraylist(arrList) : " + arrList);
        System.out.println("the original arraylist(arrList2) : " + arrList2);
        System.out.println(arrList.equals(arrList2));
        arrList2.set(0, "a");
        arrList2.add(0,"Y");
        arrList2.add(0, "H");
        arrList2.add(0,"A");

        System.out.println("The updated arraylist(arrList) : " + arrList);
        System.out.println("the updated arraylist(arrList2) : " + arrList2);
        System.out.println(arrList.equals(arrList2));

        // clear() --> The clear() method provides an easy way to discard all elements of the ArrayList.
        //Returns nothing, its return type is void

        arrList.clear();
        System.out.println(arrList);
        System.out.println(arrList.isEmpty());
        System.out.println(arrList.size());

        // How to convert an ArrayList to an Array?

        String arr[] = arrList2.toArray(new String[0]);
        System.out.println("arr array's length : " + arr.length);
        System.out.println("arr array's elements " + Arrays.toString(arr));












    }
}
