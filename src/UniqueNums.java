import java.util.*;
public class UniqueNums {
    public static void uniqNum(){
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];
        int num = 0, numValues = 0;
        boolean valid = true;
        while(numValues<numbers.length){
            do{
                System.out.println("Enter a unique number >>");
                num = in.nextInt();
                valid = true;
                for(int i=0; i<numValues; i++){
                    if(num==numbers[i]){
                        System.out.println("That number is not unique");
                        valid=false;
                        break;
                    }
                }
            }while(!valid);
            numbers[numValues] = num;
            numValues++;
        }
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
