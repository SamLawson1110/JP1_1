public class Main {
    public static void main(String[] args) {
        //VarTest class, int iNum -25, char cVal B, bool bVal true, create and initialize separately, print all
        VarTest.varTest();
        //StringOperations class, str1 "Hello", str2 "Sam", str3 null
        //StringOperations cont. str3 = "You are " + str2, print out "Welcome: " + str3
        //print str3 up to (noninclusive) char 5, print str2 in uppercase
        //compare str1 and str2, if not the same display in lexicographical order
        StringOperations.stringOper();
        //InputVariables class, make a scanner, initialize a variable for each primitive data type
        //take in a value from scanner for each variable then print
        InputVariables.inputVars();
        //AgeChecker class, take in age from scanner, if >=21, say adult
        //ask if has drivers license, y/n, if adult + license -> can hire car, print
        AgeChecker.ageCheck();
        //ValueChecker class, input int from scan, 7 lucky, 13 unlucky, other neither, print
        //do while to repeat until user enters zero
        ValueChecker.valueCheck();
        //UniqueNums class, 5 element int array called numbers, int num = 0, int numValues = 0
        //bool valid = true, scanner called in
        //while loop that loops once for each value in array
        //do while to get unique inputs, add unique numbers to array
        //cloe scanner once done in.close();, for loop to print array values
        UniqueNums.uniqNum();
    }
}
