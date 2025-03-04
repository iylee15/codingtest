import java.util.*;

class Solution {
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
		for(int i = 1; i <= s.length(); i++) {
			// 문자열 압축 후 가장 짧은 길이 선택
			int compressed = compress(s, i);
			if(min > compressed) min = compressed;
		}
        return min;
    }
    
    private int compress (String source, int length) {
		StringBuilder sb = new StringBuilder();
		String last = "";
		int count = 0;
		for(String token : split(source, length)) {
			if(token.equals(last)) {
				count++;
			} else {
				if(count > 1) sb.append(count);
				sb.append(last);
				last = token;
				count = 1;
			}
		}
        if(count > 1) sb.append(count);
        sb.append(last);
        
		return sb.length();
	}
	
	private List<String> split (String source, int length) {
		List<String> tokens = new ArrayList<String>();
		for(int startIndex = 0; startIndex < source.length(); startIndex += length) {
			int endIndex = startIndex + length;
			if(endIndex > source.length()) endIndex = source.length();
			tokens.add(source.substring(startIndex, endIndex));
		}
		return tokens;
	}
}