import java.io.*;
import java.util.Scanner;

public class BabyNameComparison
{
    public static void main(String[] args)
    {
        /*
         * Creates a String array to contain all the names
         * n is the size of the array.
         * i is the index for the first name
         * j is the index for the second name
         */

        String[] arr = new String[3];
        int n = arr.length;
        int i = 0;
        int j = 0;

        // First name
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type the first name: ");
        String nameOne = scan.nextLine();
        //Second name
        System.out.print("Please type the second name: ");
        String nameTwo = scan.nextLine();
        //Third Name
        System.out.print("Please type the third name: ");
        String nameThree = scan.nextLine();

        arr[0] = nameOne;
        arr[1] = nameTwo;
        arr[2] = nameThree;

        while(i < n)
        {
            System.out.println(arr[i] + " " + arr[j]);
            j++;
            if(j >= n)
            {
                i++;
                j = 0;
            }
        }
    }
}
