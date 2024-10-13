package notes.chapter7;

public class DayOfTheWeek {
    public static Day[] days = new Day[7];



    public static void main(String[] args) {

        days[0] = new Day("Monday", 1);
        days[1] = new Day("Tuesday", 2);
        days[2] = new Day("Wednesday", 3);
        days[3] = new Day("Thursday", 4);
        days[4] = new Day("Friday", 5);
        days[5] = new Day("Saturday", 6);
        days[6] = new Day("Sunday", 7);



        int whatDayDoYouWant = 7;


        System.out.println(getDayOfTheWeek(whatDayDoYouWant));


    }
    public static String getDayOfTheWeek(int x){
        switch (x){
            case 1:
                return days[0].name;
            case 2:
                return days[1].name;
            case 3:
                return days[2].name;
            case 4:
                return days[3].name;
            case 5:
                return days[4].name;
            case 6:
                return days[5].name;
            case 7:
                return days[6].name;

            default:
                return "Not a number for a day of the week";
        }



    }
}
