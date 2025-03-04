class Solution {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
		String reversed = new StringBuilder(str).reverse().toString();
		
        int answer = Integer.parseInt(reversed, 3);
        return answer;
    }
}