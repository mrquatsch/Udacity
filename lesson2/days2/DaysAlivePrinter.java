public class DaysAlivePrinter
{
    public static void main(String[] args)
    {
        //Day jamesGoslingsBirthday = new Day(1955, 5, 19);
        //Day today = new Day();
        //System.out.print("Today: ");
        //System.out.println(today.toString());
        //int daysAlive = today.daysFrom(jamesGoslingsBirthday);
        //System.out.print("Days alive: ");
        //System.out.println(daysAlive);
        Day birthday = new Day(1951, 5, 26);
        Day lastday = new Day(2012, 7, 23);
        int daysAlive = lastday.daysFrom(birthday);
        System.out.println(daysAlive);
    }
}
