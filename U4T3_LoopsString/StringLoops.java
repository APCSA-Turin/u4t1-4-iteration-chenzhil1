package U4T3_LoopsString;

public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive! 

  
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String searchString) {
      /* to be implemented */
      int timesAppeared = 0;
      for(int i = 0; i < searchString.length(); i ++) {

        if(character.equalsIgnoreCase(searchString.substring(i, i + 1))) {
          timesAppeared ++;

        }

      }
      return timesAppeared;
    }
    
    /* Returns the original string reversed 
     
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */  
    public String reverseString(String origString) {
      /* to be implemented */
      String reversed = "";
      for(int i = origString.length() - 1; i >= 0; i--) {
        reversed += origString.substring(i, i + 1);

      }
      return reversed;
    }

    public String removeA(String str) {
      // implement me
      String out = "";
      for(int i = 0; i < str.length(); i++) {
        if(!str.substring(i, i + 1).equalsIgnoreCase("a")) {
          out += str.substring(i, i + 1);

        }

        
      }
      return out;
   }
   
   /* Returns a String with all instances of "searchChar" in "origString" replaced with
     "replaceChar"; matches should be case sensitive (i.e. no need to worry about
      lowercase vs. uppercase)
     

    PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */  
  public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    /* to be implemented */
    String out = "";
    for(int i = 0; i < origStr.length(); i ++) {
      if(origStr.substring(i, i +1).equals(searchChar)) {
        out += replaceChar;
      }
      else {
        out += origStr.substring(i, i + 1);

      }

    }
    return out;
    
   }

    /* DOES THE EXACT SAME THING AS replaceCharacterV1, except using a while loop

    PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
      /* to be implemented */
      int index = 0;
      String out ="";
      while(index < origStr.length()) {
        if(origStr.substring(index, index +1).equals(searchChar)) {
          out += replaceChar;

        }
        else {
          out += origStr.substring(index, index + 1);

        }
        index ++;
      }
      return out;
     }

  /* Returns the number of times "searchString" appears in "origString";
     matches should be case sensitive (i.e. no need to worry about lower vs. uppercase)
     
    */  
    public int countString(String searchString, String origString) {
      /* to be implemented */
      int count = 0;
      for(int i = 0; i <= origString.length() - searchString.length(); i ++) {
        if(origString.substring(i, i + searchString.length()).equals(searchString)) {
          count ++;
        }

      }
      return count;
     }

    /* Returns a String with all instances of "searchString" removed from "origString";
       matches should be case sensitive (i.e. no need to worry about lowercase vs. uppercase)
     
    */  
    public String removeString(String searchString, String origString) {
      /* to be implemented */
      String str = origString;
      int index = 0;
      while(str.indexOf(searchString) != -1) {
        index = str.indexOf(searchString);
        str = str.substring(0, index) + str.substring(index + searchString.length());

      }
      return str;
     
     }

/* Prints all integers from fromNum through toNum, separated by
     a commas and a space, on a single line;
     there should NOT be a comma after the final number.
     If fromNum == toNum, print just the number and no comma.
     If fromNum > toNum, the numbers should be printed in descending order.
     After all numbers are printed, move the cursor to the next line.
    */  
    public void commaSeparated(int fromNum, int toNum) {
      /* to be implemented */
      for(int i = fromNum; i < toNum; i++) {
        System.out.print(i + ", ");

      }
      System.out.print(toNum);
      System.out.println("");
    }

 /* Returns true if myString is a palindrome, i.e. the characters read the same
    forwards and backwards, and false otherwise. Don't worry about case.
    NOTE!  Spaces should be disregarded when determining if it's a palindrome.
    "no lemon no melon" is a palindrome!
    
    */
    public boolean isPalindrome(String myString) {
      /* to be implemented */
      String orig = removeString(" ", myString);
      String reversed = reverseString(orig);
      if(orig.equalsIgnoreCase(reversed)) {
        return true;
      }
      return false;
      }

/* Prints the String toPrint num times on a single line separated by spaces,
    within an opening bracket and closing bracket; there should not be a space
    between the final toPrint and the closing bracket,
    e.g. [hello hello hello hello]
    
    If numtimes <= 0, print just empty brackets (no space): []
    After printing the closing bracket, move the cursor to the next line.
     
    Examples:
    - toPrint = "hello" and num = 4, print: [hello hello hello hello]
    - toPrint = "beetlejuice" and num = 3, print: [beetlejuice beetlejuice beetlejuice]
    - toPrint = "hi there" and num = 2, print: [hi there hi there]
    - toPrint = "boop!" and num = 1, print: [boop!]
    - toPrint = "dance party" and num = 0, print: []
    - toPrint = "anything" and num = -4, print: []
    */
    public void multiPrint(String toPrint, int num) {
      /* to be implemented */
      String out = "[";
      
      for(int i = 0; i < num; i ++) {
        out += toPrint;
        out += " ";

      }
      if(num < 1) {
        out += "]";
      }
      else {
        out += toPrint + "]";
      }

      System.out.println(out);
    }
  
  
}
  