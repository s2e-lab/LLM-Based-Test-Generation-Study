package scenario1;


class ValidDate {

    public static Boolean validDate(String date) {
        if (date.length() != 10) {
            return false;
        }
        String[] dateArr = date.split("-");
        if (dateArr.length != 3) {
            return false;
        }
        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);
        if (month < 1 || month > 12) {
            return false;
        }
        if (month == 2) {
            if (day < 1 || day > 29) {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                return false;
            }
        } else {
            if (day < 1 || day > 31) {
                return false;
            }
        }
        return true;
    }

}