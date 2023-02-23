package week3;

public class Admin {
    public static void main(String[] args) {
        // create an object from  AccountInfo class :
        AccountInfo accountInfo = new AccountInfo();

        //calling the methods through class objects below.
        accountInfo.getInfo();
        System.out.println("We got info from the patient and we are going to print his/her info now.");
        accountInfo.printInfo();

        Admin admin = new Admin();

    }
}
