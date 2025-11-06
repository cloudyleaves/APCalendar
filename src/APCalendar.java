public class APCalendar
{
    /** leap year is true, false otherwise */
    private static boolean isLeapYear (int year)
    {
        //leap year is every 4 years, 2000 must be /400 to be leap
        if (year/100 == 0)
        {
            if (year/400 == 0)
                return true;
            else
                return false;
        }
        else
        {
            if (year/4 == 0)
                return true;
            else
                return false;
    /** return number of leap years between years 1 & 2, inclusive */
    public static int numberOfLeapYears (int year1, int year2)
    {
        //0 <= year1 <= year2
        if (isLeapYear(year1)) = true
        {
            if (isLeapYear(year2)) = true
            {
                return "yay leap";
            }
            else
                return "no leap years";
        }
        else
            return "no leap years";
    }
    /** returns first day of the year from the week */
    private static int firstDayOfYear (int year)
    {
        //return month (1-12), day = 1. any year
    }
    /** smt smt fill in later */
    private static int dayOfyear (int month, int day, int year)
    {
        //0 = sunday & 6 = saturday ; substring
    }
    /**deadass dont know what this is for */
    public static int dayOfWeek (int month, int day, int year)
    {
        //i dunno bro???
    }
}
