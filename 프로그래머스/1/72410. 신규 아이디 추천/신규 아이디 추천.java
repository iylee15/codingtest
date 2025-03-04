class Solution {
    public String solution(String new_id) {
		// 1 대문자 -> 소문자
		new_id = new_id.toLowerCase();
		
		// 2 허용되는 문자 외의 문자 제거
		new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
		
		// 3 마침표 여러개인 경우 하나의 마침표
		new_id = new_id.replaceAll("\\.+", ".");
		
		// 4 처음/끝에 등장하는 마침표 제거
		new_id = new_id.replaceAll("^\\.+|\\.+$", "");
		
		// 5 빈 문자열일 경우 a 대입
		if(new_id.isEmpty()) new_id = "a";
		
		// 6 16자 이상이면 첫 15개의 문자 외의 문자들 제거
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("\\.+$", "");
		}
		
		// 7 길이가 2 이하라면 3이 될때까지 마지막 글자를 반복해서 붙인다
		while(new_id.length() <= 2) {
			new_id += new_id.charAt(new_id.length()-1);
		}
        return new_id;
    }
}