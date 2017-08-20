/********************************************************************************
 *Perpose: String Functions like Anagram and palindrome
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 ********************************************************************************/

package com.bridgelabz.util;

class StringFunctions{

    static String isAnagram_Msg = "Strings are Anagram";

    static String isNotAnagram_Msg = "Strings are not Anagram";

    static String isPalindrome_Msg = "String is Palindrome";

    static  String isNotPalindrome_Msg = "String is Not Palindrome";

    static char[] stringArray(String str){
        int length = str.length();
        char[] mString = new char[length];
        for(int i =0; i < length; i++){
            mString[i] = str.charAt(i);
        }
        return mString;
    }

    static boolean isAnagram(String str1, String str2){

        boolean mAnagram = false;

        int lengthFirst = str1.length();
        int lengthSecond = str2.length();

        if(lengthFirst == lengthSecond) {

            for (int i = 0; i < lengthFirst; i++) {

                for (int j = 0; j < lengthFirst; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {

                        mAnagram = true;
                        break;
                    }
                }
            }
        }
        return mAnagram;
    }

    static boolean isPalindrome(String str1){
        boolean mmPalindrome = false;

        int length1 = str1.length();

        for(int i = 0, j = length1 - 1; i < j; i++, j--){

            if(str1.charAt(i) == str1.charAt(j)){

                mmPalindrome = true;
                break;
            }
        }
        return mmPalindrome;
    }

    static void isEqual(String str1, String str2){
        char lengthStringFirst[] = stringArray(str1);
        char lengthStringSecond[] = stringArray(str2);

        if(lengthStringFirst.length == lengthStringSecond.length)
            System.out.println("Two String array are equal");
        else
            System.out.println("Two String array are not equal");
    }

    public static void main(String args[]){

        String mString1 = args[0];
        String mString2 = args[1];

        boolean mAnagramMgs = isAnagram(mString1,mString2);

        if(mAnagramMgs == true)
            System.out.println(isAnagram_Msg);
        else
            System.out.println(isNotAnagram_Msg);

        boolean mPalindrome = isPalindrome(mString1);

        if (mPalindrome == true)
            System.out.println(isPalindrome_Msg);
        else
            System.out.println(isNotPalindrome_Msg);
        isEqual(mString1,mString2);
          
        char[] name = stringArray(mString1);
        for(int i = 0; i < name.length; i++)
             System.out.println(name[i]);
    }
}