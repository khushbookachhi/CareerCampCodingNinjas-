Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
	if(s.length()<=1){
		return s;
	}
 if(s.charAt(0)!=s.charAt(1)){
		String smallOut= removeConsecutiveDuplicates(s.substring(1));
		return s.charAt(0)+smallOut;
	}
else{
	String smallOut=removeConsecutiveDuplicates(s.substring(1));
	return ""+smallOut;
}

	}

}
