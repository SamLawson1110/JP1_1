import java.util.*;
public class InputVariables {
    public static void inputVars(){
        Scanner in = new Scanner(System.in);
        double dub;
        float flo;
        long lon;
        int inte;
        char chara;
        short sho;
        byte byt;
        boolean bool;

        System.out.println("enter a double >>");
        dub = in.nextDouble();
        System.out.println("enter a float >>");
        flo = in.nextFloat();
        System.out.println("enter a long >>");
        lon = in.nextLong();
        System.out.println("enter an int >>");
        inte = in.nextInt();
        System.out.println("enter a char >>");
        chara = in.next().charAt(0);
        System.out.println("enter a short >>");
        sho = in.nextShort();
        System.out.println("enter a byte >>");
        byt = in.nextByte();
        System.out.println("enter a boolean >>");
        bool = in.nextBoolean();

        System.out.println(dub + "\n" + flo + "\n" + lon + "\n" + inte  + "\n" + chara + "\n" + sho + "\n" + byt + "\n" + bool);
    }
}
