package week5;

public class Question23 {
    public static void main(String[] args) {
//        int color = 0;
        char colorCode = 'y';
        int color = 0 ;
        switch (colorCode){
            case 'r' :
                color = 100;
                break;
            case 'b':
                color = 10;
                break;
            case 'y':
                color = 1;
                break;
        }
        System.out.println(color);
    }
}
