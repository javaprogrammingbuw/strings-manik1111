public class Palindrome{

	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.
	public static void main(String[] args){
		System.out.println(palindromeSimple("hannah"));
		System.out.println(palindromeIgnoringCase("Hannah"));
		System.out.println(palindromeIgnoringSpace("Taco cat"));

	}
	// Code for simple palindrome(String = "hannah"),using iterative method
	public static boolean palindromeSimple(String name){
		char nameCompare1= '0';
		char nameCompare2= '0';
		String name1= "";
		String name2= "";
		for(int i=0 ; i<name.length() ; i++){
			nameCompare1=name.charAt(i);
			name1=name1 + nameCompare1;
		}
		for(int i=name.length()-1 ; i>=0 ; i--){
			nameCompare2=name.charAt(i);
			name2=name2 + nameCompare2; 
		}
		if(name1.equals(name2)){
			return true;
		}else{
			return false;
		}
	}
	// Code for simple palindrome(String = "hannah"),using recursive method
	/*public static boolean isPalindromeRek(String word){
		if(word.length()<=1){
			return true;
		}
		if(word.charAt(0) != word.charAt(word.length()-1)){
			return false;
		}
		else{
			word = word.substring(1,word.length()-1);
			return isPalindromeRek(word);
		}
	}*/

    // Code for palindrome ignoring case(String = "Hannah"),using iterative method
	public static boolean palindromeIgnoringCase(String name){
		String string=name.toLowerCase();
		char nameCompare1= '0';
		char nameCompare2= '0';
		String name1= "";
		String name2= "";
		for(int i=0 ; i<string.length() ; i++){
			nameCompare1=string.charAt(i);
			name1=name1 + nameCompare1;
		}
		for(int i=string.length()-1 ; i>=0 ; i--){
			nameCompare2=string.charAt(i);
			name2=name2 + nameCompare2; 
		}
		if(name1.equals(name2)){
			return true;
		}else{
			return false;
		}
	}
    // Code for palindrome ignoring case(String = "Hannah"),using iterative method
	/*public static boolean palindromeIgnoringCaseRecurive(String name){
		String string=name.toLowerCase();
		if(string.length()<=1){
			return true;
		}
		if(string.charAt(0) != string.charAt(string.length()-1)){
			return false;
		}
		else{
			string=string.substring(1,string.length()-1);
			return palindromeIgnoringCaseRecurive(string);
		}
	}*/

	// Code for palindrome ignoring space(String = "Taco cat"),using iterative method
	public static boolean palindromeIgnoringSpace(String name){
		String string=name.toLowerCase().replaceAll(" ","");
		String name1= "";
		String name2= "";
		for(int i=0 ; i<string.length() ; i++){
			name1 += string.charAt(i);
		}
		for(int i=string.length()-1 ; i>=0 ; i--){
			name2 += string.charAt(i); 
		}
		if(name1.equals(name2)){
			return true;
		}else{
			return false;
		}
	}
	// Code for palindrome ignoring case(String = "Hannah"),using recursive method
	/*public static boolean palindromeIgnoringSpaceRecurive(String name){
		String string=name.toLowerCase().replaceAll(" ","");
		if(string.length()<=1){
			return true;
		}
		if(string.charAt(0) != string.charAt(string.length()-1)){
			return false;
		}
		else{
			string=string.substring(1,string.length()-1);
			return palindromeIgnoringCaseRecurive(string);
		}
	}*/
}