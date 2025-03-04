class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			sb.append(push(c, n));
		}
		String answer = sb.toString();
		return answer;
    }
    
    private char push(char c, int n) {
		if(!Character.isAlphabetic(c)) return c;
		int offset = Character.isUpperCase(c) ? 'A' : 'a';
		int position = c - offset;
		position = (position + n) % 26;
		return (char)(offset + position);
	}
}