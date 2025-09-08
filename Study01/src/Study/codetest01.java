package Study;

class Solution {
    public long solution(int n, int t) {

    	long answer = (long)Math.pow(n, 15);
        return answer;
    }
}

public class codetest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1, 2, 3, 4, 5]
		int[] a = {1,2,3,4,5};
		int b = 0;
		int c = 0;
		for(int i : a) {
			if(b <= i) { 
				b = i;
//				System.out.println(b);
			}
		} // b=5;
		for (int j : a) {
			if (j == b) {
			}else {
				if(c <= j){
					c = j;
				}
			}
		}
		
		System.out.println(b*c);
	}

}
