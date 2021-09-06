package com.abhinaygarg;

public class Main {

    public static void main(String[] args) {
        String total = getDurationString(30000);
        System.out.println(total);

        String hrTotal = getDurationString(324, 45);
        System.out.println(hrTotal);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return ("Invalid Value");
        } else {
            int countHours = minutes / 60;
            minutes = minutes - (countHours*60);
            return (countHours + "h " + minutes + "m " + seconds + "s");
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return ("Invalid Value");
        }else {
            int countMinutes = seconds / 60;
            seconds = seconds - (countMinutes*60);
            return getDurationString(countMinutes, seconds);
        }
    }
}



