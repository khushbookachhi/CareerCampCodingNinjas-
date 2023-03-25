Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 < |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
00001231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567
  
  import java.lang.Math;
public class solution {

	public static int convertStringToInt(String s){
		if(s.length()==1){
			return (s.charAt(0)-'0');
			
		}
        	double output=convertStringToInt(s.substring(1));
			double b= s.charAt(0)-'0';
			b = b * Math.pow(10, s.length() - 1) + output;
        return (int)(b);
		
	}
}
