class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = 0;
        int numer = 0;
        int[] answer = {numer, denom};
        
        if(denom1 != denom2) {
            denom = denom1*denom2;
            numer1 = numer1*denom2;
            numer2 = numer2*denom1;
            numer = numer1+numer2;
        } else {
            denom = denom1;
            numer = numer1+numer2;
        }
        for(int i = denom; i>0; i--){
            if(numer%i == 0 && denom%i == 0){
                numer = numer/i;
                denom = denom/i;
            }
        }
        answer[0] = numer;
        answer[1] = denom;
        return answer;
    }
}