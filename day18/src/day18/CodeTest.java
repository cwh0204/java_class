package day18;


class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count = 0;
        int sum = 0;
        for(int i = 0; i < numlist.length; i++) {
        	if((numlist[i] % n) == 0) {
        		count++;
        	}
        }
        answer = new int[count];
        for(int i = 0; i < numlist.length; i++) {
        	if((numlist[i] % n) == 0) {
        		answer[sum] = numlist[i]; 
        		sum++;
        		
        	}
        }
        return answer;
    }
}
public class CodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution num = new Solution();
		int[] num2 = {2,4,5,6,7,8};
		num.solution(2, num2);
		System.out.println(num.solution(2, num2));
	}

}
