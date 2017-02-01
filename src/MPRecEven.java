import java.util.Scanner;

/**
 * Created by Jude Ardyn Bismonte on 2/1/2017.
 */
public class MPRecEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //prompt for the number of items
        System.out.print("INPUT NO. OF ITEMS:");
        int numberOfItems = sc.nextInt();
        System.out.println("");
        int[] items = new int[numberOfItems];

        //input the values into an array
        for (int itemIndex = 0; itemIndex < items.length; itemIndex++) {
             System.out.print("Enter number "+(itemIndex+1)+": " );
            items[itemIndex] = sc.nextInt();
            System.out.println("");
        }
        System.out.println("The minimum is "+getMinimum(items,0,items[0]));

    }

    /**
     * Method used to get the minimum number recursively among the integer array
     * @param items the integer array
     * @param index the current index
     * @param minimum the current minimum
     * @return the current smallest number
     */
    public static int getMinimum(int[] items, int index,int minimum){
        if(index<items.length) return minimum;
        if(items[index]<minimum)return getMinimum(items,index+1,items[index]);
        else return getMinimum(items,index+1,minimum);
    }
}
