import java.util.*;

class Solution {
    public int[] solution(long[] numbers) {
        List<Integer> answer = new ArrayList<>();
        
        for(long number : numbers) {
        	if(isBinaryTree(number)) {
        		answer.add(1);
        	} else {
        		answer.add(0);
        	}
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private String getFullBinary(String binary) {
    	StringBuilder sb = new StringBuilder();
    	int length = binary.length();
    	int nodeCount = 1;
    	int level = 1;
    	
    	while(length > nodeCount) {
    		level *= 2;
    		nodeCount += level;
    	}
    	
    	// 추가해야 하는 0의 개수
    	int offset = nodeCount - length;
    	
    	for(int i = 0; i < offset; i++) {
    		sb.append("0");
    	}
    	sb.append(binary);
    	
    	return sb.toString();
    }
    
    // 이진트리 표현 가능한지 검사 (숫자)
    private boolean isBinaryTree(long number) {
    	String binary = Long.toBinaryString(number);
    	String fullBinary = getFullBinary(binary);
    	int length = fullBinary.length();
    	
    	int root = length / 2;
    	String leftSubTree = fullBinary.substring(0, root);
    	String rightSubTree = fullBinary.substring(root+1);
    	
    	if(fullBinary.charAt(root) == '0') {
    		return false;
    	}
    	
    	return isBinaryTree(leftSubTree) && isBinaryTree(rightSubTree);
    }
    
    // 만들어낸 2진수가 이진트리로 표현이 가능한지 확인 (문자열)
    private boolean isBinaryTree(String binary) {
    	int length = binary.length();
    	if(binary.length() == 0) return true; // 리프 노드에서 호출한 경우
    	
    	int root = length / 2;
    	// 루트 기준 왼/오른쪽 서브트리 
    	String leftSubTree = binary.substring(0, root); 
    	String rightSubTree = binary.substring(root+1);
    	
    	if(binary.charAt(root) == '0') { // 루트 노드가 0 (더미노드)이라면 서브 트리도 모두 0
    		return isZeroTree(binary.substring(0, root)) && isZeroTree(binary.substring(root+1));
    	}
    	
    	// 루트 노드가 1이라면 서브 트리 검사
    	return isBinaryTree(leftSubTree) && isBinaryTree(rightSubTree);
    }
    
    // 
    private boolean isZeroTree (String binary) {
    	int length = binary.length();
    	if(binary.length() == 0) return true;
    	
    	int root = length / 2;
    	String leftSubTree = binary.substring(0, root);
    	String rightSubTree = binary.substring(root + 1);
    	
    	if(binary.charAt(root) == '1') {
    		return false;
    	}
    	return isZeroTree(leftSubTree) && isZeroTree(rightSubTree);
    }
}