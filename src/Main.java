import java.time.LocalTime;
import java.util.*;
import java.lang.*;

class Clocks{

    String clockName;
    Integer hour;
    Integer minute;
    Integer second;
    LocalTime currentTime;

    public Clocks(String clockName,int hour, int minute,int second) {
        this.clockName=clockName;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.currentTime= LocalTime.of(hour,minute,second);
    }

    public LocalTime addMinute(){
        return currentTime.plusMinutes(1);
    }

    public String toString(){
        return "Clock" + " " + clockName + " " + "shows"+ " " + currentTime;
    }
}
public class Main{
    public static void main (String[] args) {

        Clocks yellowClock = new Clocks ( "Yellow", 14, 12,11);
        Clocks blueClock = new Clocks("Blue", 13,45,56);
        Clocks greenClock = new Clocks("Green", 22,54,32);
        Clocks redClock = new Clocks("Red", 19,28,36);
        Clocks orangeClock = new Clocks("Orange", 21,56,23);

        System.out.println(yellowClock);
        System.out.println(blueClock);
        System.out.println(greenClock);
        System.out.println(redClock);
        System.out.println(orangeClock);

        LinkedList<Clocks> clockList = new LinkedList<>();

        clockList.add(yellowClock);
        clockList.add(blueClock);
        clockList.add(greenClock);
        clockList.add(redClock);
        clockList.add(orangeClock);

        System.out.println("\nAdding a minute to each of the clocks\n");

        for (Clocks clocks : clockList) {

            System.out.println("Clock" + " " + clocks.clockName + " " + "shows" + " " + clocks.addMinute());
        }
    }
}