public class SwitchChallenge02 {
    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDays(0);
        printWeekDays(4);
        printWeekDays(8);

    }
    public static void printDayOfWeek(int Day){
        String daysOfTheWeek = switch (Day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(Day + " is Stand for " + daysOfTheWeek);
    }
    public static void printWeekDays(int Day){

       String daysOfTheWeek;
       if (Day == 0){
           daysOfTheWeek = "Sunday";
        } else if (Day == 1) {
           daysOfTheWeek = "Monday";
       } else if (Day == 2) {
           daysOfTheWeek = "Tuesday";
       } else if(Day == 3){
           daysOfTheWeek = "Wednesday";
       } else if(Day == 4){
           daysOfTheWeek = "Thursday";
       } else if (Day == 5) {
           daysOfTheWeek = "Friday";
       } else if (Day == 6) {
           daysOfTheWeek = "Saturday";
       }else {
           daysOfTheWeek = "Invalid Day";
       }
       System.out.println(Day + " is Stand For " +daysOfTheWeek);
    }
}
