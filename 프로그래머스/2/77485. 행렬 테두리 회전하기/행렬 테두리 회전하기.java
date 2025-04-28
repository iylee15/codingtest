class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
	        
	        // 테이블 생성
	        int[][] table = new int[rows][columns];
	        int number = 1;
	        for(int i = 0; i < rows; i++) {
	        	for(int j = 0; j < columns; j++) {
	        		table[i][j] = number++;
	        	}
	        }
	        
	        for(int i = 0; i < queries.length; i++) {
	        	answer[i] = rotate(table, queries[i]);
	        	
	        }
	        
	        return answer;
    }
    
    // 회전
	    public int rotate(int[][] table, int[] queries) {
        	
        	int x1 = queries[0]-1;
        	int y1 = queries[1]-1;
        	int x2 = queries[2]-1;
        	int y2 = queries[3]-1;
        	
        	// 시작위치 값 저장
        	int temp = table[x1][y2];
        	int min = temp;
        	
            // 숫자를 우로 이동 (상단)
        	for(int i = y2-1; i >= y1; i--) {
        		min = Math.min(min, table[x1][i]);
        		table[x1][i+1] = table[x1][i];
        	}
        	
        	// 숫자를 위로 이동 (좌측)
        	for(int i = x1+1; i <= x2; i++) {
        		min = Math.min(min,  table[i][y1]);
        		table[i-1][y1] = table[i][y1];
        	}
        	
        	// 숫자를 좌로 이동 (하단)
        	for(int i = y1+1; i <= y2; i++) {
        		min = Math.min(min, table[x2][i]);
        		table[x2][i-1] = table[x2][i];
        	}
        	
        	// 숫자를 아래로 이동 (우측)
        	for(int i = x2-1; i >= x1; i--) {
        		min = Math.min(min, table[i][y2]);
        		table[i+1][y2] = table[i][y2];
        	}
        	
        	table[x1+1][y2] = temp;
        	return min;
	        	
	    }
}