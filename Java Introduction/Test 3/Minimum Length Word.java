Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a

public class Solution {
	
	public static String minLengthWord(String input){
	//	String input = "this is a new string";
        String minim = input;
        // System.out.print(minim);
        String current = input;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (current.length() < minim.length()) {
                minim = current;
            }
            if (input.charAt(i) == ' ') {
                current = input.substring(count, i);
                count = i + 1;
            }
            else if(i==input.length()-1){
                current=input.substring(count, i+1);
            }
        }
       return minim;
    }
 }

