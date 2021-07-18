/*
 *
 * Written by: Michael Brodskiy
 * Class: Programming with Java (COMSC-255)
 * Instructor: Prof. Chern
 *
 */

/**
 * The Organizer class takes in a string and counts the amount of vowels and consonants
 */

public class Organizer

{

    private char[] phrase;
    private String[] vowelList = {"A", "E", "I", "O", "U"};
    private String[] consList = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};

    /**
     * This no-arg constructor takes in a String and sets phrase equal to the String
     * @param str The string that phrase will be set to
     */

   public Organizer(String str) {

       phrase = str.toCharArray();

   } 

   /**
    * This mutator allows the user to change the contents of the phrase String
    * @param str The string that phrase will be set to
    */

   public void setPhrase(String str) {

       phrase = str.toCharArray();

   }

   /**
    * This method counts the amount of vowels present in phrase
    * @return The amount of vowels in phrase
    */

   public int vowelCount() {

       int vowels = 0;

       for (int i = 0; i < phrase.length; i++) {

           if (isVowel(phrase[i])) {

               vowels++;

           }

       }

       return vowels;

   }

   /**
    * This method counts the amount of consonants present in phrase
    * @return The amount of consonants in phrase
    */

   public int consCount() {

       int cons = 0;

       for (int i = 0; i < phrase.length; i++) {

           if (isCons(phrase[i])) {

               cons++;

           }

       }

       return cons;

   }

   /**
    * The isVowel method returns true if char ch is vowel, and false if not
    * @param ch The char to be analyzed
    * @return True if a vowel, false if not
    */

   public boolean isVowel(char ch) {

       boolean flag = false;

       for (int i = 0; i < vowelList.length; i++) {

           if (String.valueOf(ch).compareToIgnoreCase(vowelList[i]) == 0) {

               flag = true;

           }

       }

       return flag;

   }

   /**
    * The isCons method takes in a char and returns true if it is a consonant, false if not
    * @param ch The char that will be analyzed
    * @return True if consonant, false if not
    */

   public boolean isCons(char ch) {

       boolean flag = false;

       for (int i = 0; i < consList.length; i++) {

           if (String.valueOf(ch).compareToIgnoreCase(consList[i]) == 0) {

               flag = true;

           }

       }

       return flag;

   }

}
