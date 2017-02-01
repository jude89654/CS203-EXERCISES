import java.util.Scanner;

/**
 * Created by Jude Ardyn Bismonte on 2/1/2017.
 */
public class MPRecOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT NO. OF ITEMS");
        int numberOfItems = sc.nextInt();
        System.out.println("");
        int[] items = new int[numberOfItems];

        //input the values into an array
        for (int itemIndex = 0; itemIndex < items.length; itemIndex++) {
             System.out.print("Enter number "+(itemIndex+1)+": " );
            items[itemIndex] = sc.nextInt();
            System.out.println("");
        }
        System.out.println("The number of integers greater than 0 are "+countGreaterThanZero(items,0));

    }

    /**
     * function that returns the number of integers greater than 0 recursively
     * @param items the integer array
     * @param index the current index
     * @return a number of integers in the integer array that is greater than 0
     */
    public static int countGreaterThanZero(int[] items,int index){
        if(index==items.length)return 0;
        if(items[index]>0)return 1+countGreaterThanZero(items,index+1);
        else return countGreaterThanZero(items,index+1);


    }

}
