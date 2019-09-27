import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word =scan.nextLine();
		System.out.println(expandForEveryCondition(word)); 
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
	}
	/*public static String expand(String word){
    char num;
    int multiplier= 0;
    String character = "";

    	for(int i=0 ; i<word.length(); i++){
        	num=word.charAt(i);
        	;
        if(Character.isDigit(num)){
        	multiplier=Integer.parseInt( Character.toString(num));
        	
        }
        else{
        	for(int j=multiplier ; j>0 ; j--){
        	character+=word.charAt(i);
        }

        } 
    }
    return character;

	}*/	
	/*public static String expandForLargeNumbers(String word){
    char num;
    int multiplier= 0;
    String character = "";
    String man = "";

    	for(int i=0 ; i<word.length(); i++){
        	num=word.charAt(i);
        	
        if(Character.isDigit(num)){
         man+=Character.toString(num);
        	
        }
        else{ 
        	multiplier=Integer.parseInt(man);
        	for(int j=multiplier ; j>0 ; j--){
        	character+=word.charAt(i);
            man = "";
    }
        } 
    }
    return character;

	}*/

public static String expandForEveryCondition(String word){
    char num;
    int multiplier= 1;
    String character = "";
    String man = "";

    	for(int i=0 ; i<word.length(); i++){
        	num=word.charAt(i);
        	
        if(Character.isDigit(num)){
         man+=Character.toString(num);
        	
        }
        else{ 
        	if(!man.equals("")){
        	multiplier=Integer.parseInt(man);
        }
        	for(int j=multiplier ; j>0 ; j--){
        	character+=word.charAt(i);
            man = "";
            multiplier = 1;
    }
        } 
    }
    return character;

	}	



	
}
