package notes.chapter7;

import java.util.Arrays;
import java.util.Random;

public class LottoTicket {
    private static final int LENGTH = 6;
    //      Static Belongs to the class
    private static final int MAX_TICKET_NUMB = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbs();
        printTicket(ticket);
    }



    public static int[] generateNumbs(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();// this makes a random number similar to how Math.random() works
                                     //instead of Math.random(), we can then use random.nextInt(), inside the () we can set the highest number/ range we want and add a starting point

        for(int i = 0; i < LENGTH; i++){
            int randomNumber;

            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMB) + 1;// this generates a random number as long as theres no duplicates
            }while (search(ticket, randomNumber));


            ticket[i] = randomNumber;

        }
        return ticket;

    }


    public static boolean search(int[] array, int number){ //Sequential search

        for(int i : array){//loops through array
            if(i == number){
                return true;
            }

        }
    return false;
    }


public static boolean searchBinary(int[] array, int number){ //Binary search, does the same thing as above
    Arrays.sort(array);// this sorts the array from lowest to highest

  int index = Arrays.binarySearch(array, number);// this searches the array and checks if the random number is already in the array
  if(index >= 0){
      return true;
  }else {
      return false;
  }

}



    public static void printTicket(int[] ticket){
        for(int i : ticket){
            System.out.print(i + " ");

        }
        System.out.println("");
    }
}
