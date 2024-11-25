/* ACKNOWLEDGEMENT: I HAVE RECEIVED HELP FROM PROF. FARZANA'S YOUTUBE VIDEO
 *                  I ALSO RECEIVED HELP FROM SHREYA DURING LAB TIME
 * 
 * 
 * AUTHOR: JACOB BIANCO
 * DATE: 9/15/2024
 */

public class WordGuess {

   /*    
    *    1. Takes the word the player is trying to guess and generates a 
    *    pattern of '*' values to represent letters that have not yet
    *    been guessed. For example, if the word were "dog" this method would return "***".
    *    @param theWord: the word from the dictionary
    *    @return: the userWord filled in with the "*" symbol
    */
    public static String makeUserWord(String theWord) {
       String userWord = "";
       int i = 0;

       for (i = 0; i < theWord.length(); ++i){
        userWord += "*";

       }
       return userWord;
    }

   /*   
    *    2. Returns true if the guessed character is in the word, 
    *    false otherwise. For example, if the guess were 'x' and the word
    *    were "xylophone" this method would return true.
    *    @param guess: The character that the user gussed
    *    @param theWord: The word from the dictionary
    *    @return: true if guess is in theWord, false otherwise
    */
    public static boolean isInWord(char guess, String theWord) {
       int i = 0;
       boolean found = false;

       for(i = 0; i < theWord.length(); ++i) {
         if (guess == theWord.charAt(i)) {
            found = true;
         }
       }
         return found;
    }

   /*     
    *    3. Returns a userWord with all occurrences of '*' corresponding 
    *    to the current guess replaced with that guess. For example,
    *    if the word was "fetch" and the user word was "****h" and the user 
    *    guessed 'e', the return string would be "*e**h".
    *    @param guess: The character that the user gussed 
    *    @param userWord: The progress word that shows where the user is
    *    @param theWord: The dictionary word they are trying to guess
    */
    public static String updateUserWord(char guess, String userWord, String theWord) {
      String newUserWord = "";
      int i = 0;

      for(i = 0; i < theWord.length(); ++i){
         if (guess == theWord.charAt(i)){
            newUserWord += guess;
         }
         else {
            newUserWord += "*";
         }
         
      }
      return newUserWord;
    }


   /*   
    *    4. Updates the list of guesses with the current guess. The update 
    *    should only add the guess if it does not already exist in
    *    the list. The new guess must be placed at the end of the existing 
    *    list of guesses. For example, if guesses were "tabg" and
    *    the current guess were 'f', this method would return "tabgf".
    *    @param gusses: a list of characters that the user has gussed
    *    @param guess: the character that the user gusses
    *    @return: the updated list of characters that the user has gussed, excluding repeats
    */
    public static String updateGuesses(String guesses, char guess) {
     
      return guesses + guess;
    }


    /*  
     *   5. Returns a String that is the userWord with spaces between 
     *   each letter and each '*' replaced with an '_'. For example, if
     *   the userWord is "fe***" this method would return "f e _ _ _". Note 
     *   that there is no space before the 'f' and after the last '_'.
     *   @param userWord: The progress word that shows where the user is
     *   @return userWord: 
     */
     public static String displayUserWord(String userWord) {
      int i = 0;
      String wordUnderscored = "";

      for(i = 0; i < userWord.length(); ++i){
         if ('*' == (userWord.charAt(i))){
            wordUnderscored += "_ ";
         }
         else{
         wordUnderscored += userWord.charAt(i) + " ";
         }
         
      }
      // CHEKCS IF LAST CHAR IS A SPACE AND IF TRUE, EXCLUDES THE SPACE
      if (wordUnderscored.charAt(wordUnderscored.length()-1) == ' '){
         wordUnderscored = wordUnderscored.substring(0, wordUnderscored.length()-1);
      }
      return wordUnderscored;
     }


    /*  
     *   6. Returns a String in the form "Strikes: %d\tGuesses: %s", 
     *   with the list of guesses separated by spaces. For example, if
     *   there were 3 strikes and guesses were "bcd", this method would 
     *   return"Strikes: 3\tGuesses: b c d".
     *   @param strikes: the number of strikes the user has
     *   @param gusses: a list of characters that the user has gussed 
     */
     public static String displayGuesses(int strikes, String guesses) {
      // PUTS SPACE BETWEEN EACH GUESS FOR READIBILITY
      guesses = guesses.replace("", " ");
      
      return "Strikes: " + strikes + "\t Guesses: " + guesses; 
     }

}