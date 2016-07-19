import java.util.Scanner;

public class AngryProfessor {

    /*
     * My solution to Angry Professor problem @ HackerRank.com
     * 
     */
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	for(int a0 = 0; a0 < t; a0++){
	    int n = in.nextInt();
	    int k = in.nextInt();
	    int a[] = new int[n];
	    for(int a_i=0; a_i < n; a_i++){
		a[a_i] = in.nextInt();
	    }
	    
	    if(getNumberOfStudentsOnTime(a)>=k){
		System.out.println("NO");
	    } else {
		System.out.println("YES");
	    }
	    
	    
	}
	
    }

    public static int getNumberOfStudentsOnTime(int [] a){
	    int count = 0;
	    for (int i : a) {
		if(i<=0){
		    count++;
		}
	    }
	    return count;
	}
}
