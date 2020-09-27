enum Day{
    SATURDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;
}
public class  Enum {
    Day day;
    Enum(Day day){
        this.day = day;
    }
    public void talkAboutDay(){
        switch (day){
            case MONDAY:
                System.out.println(day + " is good");

        }
    }

    public static void main(String[] args) {
        Enum en1 = new Enum(Day.MONDAY);
        en1.talkAboutDay();
    }
}


