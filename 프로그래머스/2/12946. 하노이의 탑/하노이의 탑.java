import java.util.*;

class Solution {
    public int[][] solution(int n) {
        return hanoi(n, 1, 3).toArray(new int[0][]);
    }
	
	private List<int[]> hanoi (int n, int from, int to) {
		// 종료 조건
		if(n == 1) return List.of(new int[] {from, to});
		
		// 점화식 구현
		int empty = 6 - from - to;
		
		List<int[]> result = new ArrayList<int[]>();
		result.addAll(hanoi(n-1, from, empty));
		result.addAll(hanoi(1, from, to));
		result.addAll(hanoi(n-1, empty, to));
		return result;
	}
}