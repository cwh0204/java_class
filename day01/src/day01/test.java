package day01;
import java.util.Arrays;

public class test {
	
	class Solution {
	    public static String solution(int n, int k) {
	        int answer = 0;
//	        if((0 < n && n < 1000) && (0 <= k && k < 1000)){
//	            if(n % 10 == 0) {
//	            	answer += (k * 2000) + (n * 12000) - (2000);
//		        }else {
//		        	answer += (k * 2000) + (n * 12000);
//		        }
//	        }
	        
	        return String.format("%,d", answer);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,2,3};
//		int length = a.length;
//		int[] b = new int[length];
//          for(int i= 0; i <= length-1; i++){
//              b[i]+= a[i] * 2;
//              System.out.println(b[i]);
//		}
		System.out.println(113/10);
		System.out.println(Solution.solution(100,30));

	}

}
