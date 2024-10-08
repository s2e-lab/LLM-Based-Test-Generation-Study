package scenario2;


import java.util.Arrays;


class FileNameCheck {
    /**
     * Create a function which takes a string representing a file's name, and returns
     * 'Yes' if the the file's name is valid, and returns 'No' otherwise.
     * A file's name is considered to be valid if and only if all the following conditions
     * are met:
     * - There should not be more than three digits ('0'-'9') in the file's name.
     * - The file's name contains exactly one dot '.'
     * - The substring before the dot should not be empty, and it starts with a letter from
     * the latin alphabet ('a'-'z' and 'A'-'Z').
     * - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
     */
    public static String fileNameCheck(String fileName) {
        String[] suf = {"txt", "exe", "dll"};
        String[] lst = fileName.split("\\.");
        if (lst.length != 2) {
            return "No";
        }
        if (!Arrays.asList(suf).contains(lst[1])) {
            return "No";
        }
        if (lst[0].length() == 0) {
            return "No";
        }
        if (!Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = 0;
        for (int i = 0; i < lst[0].length(); i++) {
            if (Character.isDigit(lst[0].charAt(i))) {
                t++;
            }
        }
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }


}