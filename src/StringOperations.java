import jdk.swing.interop.SwingInterOpUtils;

public class StringOperations {
    public static void stringOper(){
        String str1 = "Hello";
        String str2 = "Sam";
        String str3;

        str3 = "You are " + str2;
        System.out.println(str3.substring(0, 4) + "\n" + str2.toUpperCase());
        int compare = str2.compareTo(str1);
        if(compare < 0){
            System.out.println(str2 + " comes before " + str1 + " in the alphabet");
        } else if(compare > 0){
            System.out.println(str1 + " comes before " + str2 + " in the alphabet");
        } else {
            System.out.println("These strings are equal");
        }
    }
}
