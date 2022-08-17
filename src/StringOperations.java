public class StringOperations {
    public static void stringOper(){
        //StringOperations class, str1 "Hello", str2 "Sam", str3 null
        //StringOperations cont. str3 = "You are " + str2, print out "Welcome: " + str3
        //print str3 up to (noninclusive) char 5, print str2 in uppercase
        //compare str1 and str2, if not the same display in lexicographical order
        String str1 = "Hello";
        String str2 = "Sam;";
        String str3;

        str3 = "You are " + str2;
        System.out.println(str3.substring(0, 4) + "\n" + str2.toUpperCase());
        if(str1.equals(str2)){
            System.out.println("str1 and str2 are the same");
        } else {
            System.out.println();
        }
    }
}
