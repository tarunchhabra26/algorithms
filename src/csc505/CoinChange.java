package csc505;

/* Dynamic Programming Java implementation of Coin
Change problem */
import java.util.Arrays;

class CoinChange
{
 static long minCoins(int S[], int m, int n)
 {
     //Time complexity of this function: O(mn)
     //Space Complexity of this function: O(n)

     // table[i] will be storing the number of solutions
     // for value i. We need n+1 rows as the table is
     // constructed in bottom up manner using the base
     // case (n = 0)
     long[] table = new long[n+1];

     // Initialize all table values as 0
     Arrays.fill(table, Integer.MAX_VALUE);   //O(n)

     // Base case (If given value is 0)
     table[0] = 0;

     
     for(int i = 1; i <=n ; i++){
    	 for(int j = 0 ; j < m ; j++){
    		 if (S[j] <= i){
    			 long sub_res = table[i-S[j]];
    			 if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
    				 table[i] = sub_res + 1;
    		 }
    		 System.out.println("for i:" + i);
    		 for (int k=0;k< table.length;k++)
    			 System.out.println("table["+k+"] = " + table[k]);
    	 }
     }
     
     return table[n];
 }

 // Driver Function to test above function
 public static void main(String args[])
 {
     int arr[] = {1, 2, 3};
     int m = arr.length;
     int n = 4;
     System.out.println(minCoins(arr, m, n));
 }
}