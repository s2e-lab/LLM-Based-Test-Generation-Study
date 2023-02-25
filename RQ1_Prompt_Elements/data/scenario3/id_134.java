package scenario3;


class CheckIfLastCharIsALetter {
    /**
     * * Create a function that returns True if the last character
     * of a given string is an alphabetical character and is not
     * a part of a word, and False otherwise.
     * Note: "word" is a group of characters separated by space.

     * Examples:
     * check_if_last_char_is_a_letter("apple pie") ➞ False
     * check_if_last_char_is_a_letter("apple pi e") ➞ True
     * check_if_last_char_is_a_letter("apple pi e ") ➞ False
     * check_if_last_char_is_a_letter("") ➞ False 
     *
     * > checkIfLastCharIsALetter("apple")
     * false
     * > checkIfLastCharIsALetter("apple pi e")
     * true
     * > checkIfLastCharIsALetter("eeeee")
     * false
     * > checkIfLastCharIsALetter("A")
     * true
     * > checkIfLastCharIsALetter("Pumpkin pie ")
     * false
     * > checkIfLastCharIsALetter("Pumpkin pie 1")
     * false
     * > checkIfLastCharIsALetter("")
     * false
     * > checkIfLastCharIsALetter("eeeee e ")
     * false
     * > checkIfLastCharIsALetter("apple pie")
     * false
     * > checkIfLastCharIsALetter("apple pi e ")
     * false
     */
    public static Boolean checkIfLastCharIsALetter(String txt) {
        if (txt.length() == 0) {
            return false;
        }
        char lastChar = txt.charAt(txt.length() - 1);
        if (Character.isLetter(lastChar)) {
            if (txt.length() == 1) {
                return true;
            }
            char secondLastChar = txt.charAt(txt.length() - 2);
            if (Character.isLetter(secondLastChar)) {
                return false;
            }
            return true;
        }
        return false;
    }


}