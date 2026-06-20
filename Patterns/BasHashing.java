//covered basic hashing concepts - array hashing, character hashing and completed one basic problem
//date - 20-06-2026
import java.util.Scanner;
public class BasHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input for array
        int n = sc.nextInt();
        int[] arr = new int[n];
        //storing array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        //display array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

        //precomputation - we created a new array
        int[] hash = new int[13];
        for(int i = 0; i<n;i++) {
            hash[arr[i]]++;
        }

        System.out.println(hash[1]);

        //character hashing
        int n = sc.nextInt();
        sc.nextLine();
        char[] arr1 = new char[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextLine().charAt(0);
        }
 //for display character array
        for(int i=0;i<n;i++) {
            System.out.println(arr1[i]);
        }

        //pre computation for character hashing
        int[] hash = new int[26];
        for(int i = 0; i<n; i ++) {
            hash[arr1[i]-'a']++; //using ascii values
        }

        System.out.println(hash[0]);

        //question - check how many times 5,4,3 rating appears on a youtube video?

        //youtube video rating data
        int[] rating = {5,4,5,3,5,4,1,5};
        //pre computation
        int[] hash = new int[7];
        for(int i =0;i<rating.length;i++) {
            hash[rating[i]]++;
        }
        //printing stats
        System.out.println(hash[5]);
        System.out.println(hash[4]);
        System.out.println(hash[1]);



    }
}