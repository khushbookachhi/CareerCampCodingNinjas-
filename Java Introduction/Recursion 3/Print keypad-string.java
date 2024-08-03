public class solution {
public static  String getString(int n){
		switch(n){
			case 2:
			return "abc";
		
			case 3:
			return  "def";
			
			case 4:
			return "ghi";
			
			case 5:
			return "jkl";
			case 6:
			return "mno";
			case 7:
			return "pqrs";
			
			case 8:
			return "tuv"; 
			
			case 9:
			return "wxyz";
			
			default: 
			return "";

		}
		}
public static void printKeypadCombination(int input, String stringsofar){
	if(input==0){
		System.out.println(stringsofar);
		return;
	}
	int getindex=input%10;
		String getStringOptions=getString(getindex);
		int i=0;
		while(i<getStringOptions.length()){
			printKeypadCombination(input/10, getStringOptions.charAt(i)+stringsofar);
			i++;
		}
}
	public static void printKeypad(int input){
	
		printKeypadCombination(input, "");
	}
}
