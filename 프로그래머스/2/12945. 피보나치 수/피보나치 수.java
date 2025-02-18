class Solution {
    public int solution(int n) {
        int[] answer = new int[n+1];
        for(int i = 0; i <= n; i++) {
            if(i == 0) answer[0] = 0;
            if(i == 1) answer[1] = 1;
            if(i >= 2) {
                int sum = answer[i-1]+answer[i-2];
                answer[i] = sum%1234567;
            }
        }
        int result = answer[n];
        return result;
    }

}