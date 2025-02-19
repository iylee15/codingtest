import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");
        System.out.println(strArray[0]);
        int[] intArray = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
        System.out.println(intArray[0]);
        Arrays.sort(intArray);
        int min = intArray[0];
        int max = intArray[intArray.length-1];
        answer = min + " " + max;
        return answer;
    }
}