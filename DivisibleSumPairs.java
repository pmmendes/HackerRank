import java.util.Scanner;

public class DivisibleSumPairs {

    /*
     * My solution to Divisible Sum Pairs problem @ HackerRank.com
     * 
     */
    public static void main(String[] args) {
	 	Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int count = 0;
	        for (int i =0; i < n; i++){
	            for (int j=0; j < n; j++ ) {
	                if(j>i){	                    
	                    int b = ((a[i]+a[j]) % k);
//	                    System.out.println("Pair (i,j) | ("+i+","+j+") :" +b);
			    if(b == 0){
	                        count++;
	                    }
	                }
	            }
	        } 
	        System.out.println(count);

    }

}
