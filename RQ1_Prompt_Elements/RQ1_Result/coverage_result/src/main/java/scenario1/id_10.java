package scenario1;


class MakePalindrome {

    public static String makePalindrome(String string) {
        if (string.length() == 0) {
            return "";
        }
        String reversed = new StringBuilder(string).reverse().toString();
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i).equals(reversed.substring(0, string.length() - i))) {
                return string + reversed.substring(string.length() - i);
            }
        }
        return null;
    }

}