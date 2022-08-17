import java.util.*;
public class AgeChecker {
    public static void ageCheck(){
//AgeChecker class, take in age from scanner, if >=21, say adult
        //ask if has drivers license, y/n, if adult + license -> can hire car print
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age? >>");
        int age = in.nextInt();
        System.out.println("Do you have a license? (y/n) >>");
        char license = in.next().charAt(0);
        if(age >= 21){
            System.out.println("You are an adult");
            if(license=='y'){
                System.out.println("You can hire a car");
            }else System.out.println("You can't hire a car without a license");
        }else System.out.println("You are not an adult and cannot hire a car");
    }
}
