public class SecondAndMinitesChellenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3565));
        System.out.println(getDurationString(128,121));
        System.out.println(getDurationString(-12));
        System.out.println(getDurationString(-11,121));
        System.out.println(getDurationString(11,-122));

    }

    public static String getDurationString(int seconds){
       if (seconds < 0){
           return "Please give a valid number";
       }
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int minutesremainder = minutes % 60;
        int remainingseconds = seconds % 60;

        return hours + "h" + minutesremainder + "m" + remainingseconds + "s";

    }
    public static String getDurationString(int minutes, int seconds) {

        if (seconds < 0 || minutes < 0) {
            return "Please give a valid number";
        } else if (seconds >= 60) {
            int second2 = seconds / 60;
            int minutes2 = second2 + minutes;
            int hours = minutes / 60;
            int minutesremainder = minutes2 % 60;
            int remainingseconds = seconds % 60;
            return hours + "h" + minutesremainder + "m" + remainingseconds + "s";
        } else {
            int hours = minutes / 60;
            int minutesremainder = minutes % 60;
            int remainingseconds = seconds % 60;
            return hours + "h" + minutesremainder + "m" + remainingseconds + "s";

        }

    }
}


