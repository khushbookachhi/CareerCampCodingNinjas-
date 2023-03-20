Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always

public class Solution {
	public static String reverseWordWise(String input) {
int curEnd=input.length()-1;
String reverse = "";
for(int i=input.length()-1; i>=0; i--){
	if(i==0){
		reverse += input.substring(i, curEnd + 1);
	}
	if(input.charAt(i)==' '){
	  reverse+= input.substring(i+1, curEnd+1)+" ";
	  curEnd=i-1;
	}
	
}
return reverse;
	}
}
