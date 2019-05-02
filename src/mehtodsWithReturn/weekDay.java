package mehtodsWithReturn;

public class weekDay {
    public static void main(String[] args) {
        System.out.println(isValidWeekDay("monday"));
        boolean valid = isValidWeekDay("sunday");


        //isValidWeekDay method: accepts a weekDayName, and checks
        //if it is valid one of 7 days then return true, otherwise return false
    }


        public static boolean isValidWeekDay(String weekDays){

        weekDays=weekDays.toLowerCase().trim();

        if (weekDays.equals("monday") || weekDays.equals("tuesday") || weekDays.equals("wensday") ||
        weekDays.equals("thursday") || weekDays.equals("friday") || weekDays.equals("saturday") ||
        weekDays.equals("sunday"))
        {
            return true;

        }
        return false;

    }

}
