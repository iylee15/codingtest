class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
		String reversed = new StringBuilder(str).reverse().toString();
		char[] charArr = reversed.toCharArray();
        int[] answer = new int[charArr.length];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = charArr[i] - '0';
        }
        return answer;
    }
}