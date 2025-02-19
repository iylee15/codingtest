class Solution {
    public int solution(int n) {
        int answer = 1;
        int start = 1;
        while(start <= n/2) {
            int sum = 0;
            for(int i = start; i < n; i++) {
                sum += i;
                if(sum > n) break;
                if(sum == n) {
                    answer++;
                    break;
                }
            }
            start++;
        }
        return answer;
    }
}