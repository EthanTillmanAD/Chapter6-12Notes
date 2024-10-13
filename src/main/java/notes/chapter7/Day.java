package notes.chapter7;

public class Day {
    public String name;
   private int dayId;

    public Day(String name, int dayId) {
        this.name = name;
        this.dayId = dayId;
    }

    public int getDayId() {
        return dayId;
    }
}
