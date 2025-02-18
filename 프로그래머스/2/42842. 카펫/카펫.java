class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];
        
        for(int col = 3; col <= total/3; col++) {
            if(total%col == 0) {
                System.out.println(col);
                int row = total/col;
                if(row > col) continue;
                if((col-2)*(row-2) == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    System.out.println(col + " " + row);
                    return answer;
                }
            }
        }
        
        return answer;
    }
    
    static void combination() {
        
    }
}