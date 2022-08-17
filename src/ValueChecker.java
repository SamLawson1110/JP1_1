import java.util.*;
public class ValueChecker {
    public static void valueCheck(){
        Scanner in = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a number (0 to stop) >>");
            num = in.nextInt();
            if(num == 13){
                System.out.println("This number is unlucky");
            } else if (num == 7){
                System.out.println("This number is lucky");
            } else if (num != 0){
                System.out.println("This number is neither lucky no unlucky");
            }
        } while(num != 0);
    }
}
