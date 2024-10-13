package notes.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Grades {
    public static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades?");
        grades = new int[scanner.nextInt()];// this sets the length of the array

        getGrades();

        System.out.println("Average: " + String.format("%.2f", getAverage()));

        System.out.println("Highest grade was: " + getHighest());
        System.out.println("Lowest grade was: " + getLowest());
    }
    public static void getGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade number "  + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static double calcSum(){
        int total = 0;
        for(int i : grades){
            total += i;
        }
        return total;
    }

    public static double getAverage(){
        return calcSum() / grades.length;
    }

    public static int getHighest(){
      Arrays.sort(grades);
      return grades[grades.length - 1];
    }

    public static int getLowest(){
        int Lowest = grades[0];
        for(int i : grades){
            if(i < Lowest){
                Lowest = i;
            }
        }
        return Lowest;
    }

}
