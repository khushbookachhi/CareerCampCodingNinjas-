//import com.sun.java.util.jar.pack.Instruction.Switch;

public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
       if(n==0){
			String[] output= new String[1];
			output[0]="";
			return output; 
		}
		String smallOutput[]=  keypad(n/10);
		int lastdigit=n%10;
		String lastdigitOptions=getString(lastdigit);
		String[] output= new String[smallOutput.length*lastdigitOptions.length()];
		int k=0;
		for(int i=0; i<smallOutput.length; i++){
			for(int j=0; j<lastdigitOptions.length(); j++){
				output[k]=smallOutput[i]+ lastdigitOptions.charAt(j);
				k++;
			}
		}
		return output;
		
	}
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
	}
	
