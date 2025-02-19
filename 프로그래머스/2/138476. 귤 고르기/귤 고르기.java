import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0; // 귤의 종류의 수
        int sum = 0; // 담은 귤의 합
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        ArrayList<Integer> sizeList = new ArrayList<>(map.values());
        Collections.sort(sizeList, Collections.reverseOrder());
        
        for(int j : sizeList) {
            if(sum + j >= k) {
                answer++;
                break;
            } else {
                sum+=j;
                answer++;
            }
        }
        
        return answer;
    }
}