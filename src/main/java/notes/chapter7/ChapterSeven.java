package notes.chapter7;

public class ChapterSeven {

    public static void main(String[] args) {

     //A
        //arrays can hold multiple objects
        //arrays must be of the same data type
        int[] lottoTicket = new int[6];
        //                once size has been set the array cannot change the length


        //we can set values of the array by using the index possiton such as below
        //arrayName[index position] = elementWanted;
        lottoTicket[0] = 4;

        //we can also build array Litterals by using the body brackets

        int[] lottoTickets2 = {4,6,7,8,9,2};
        //this sets all elements inside the array already to get each element
        //we must call it somehow using just the arrayName[index position we want]

        System.out.println(lottoTickets2[0]);// this will print out the first element in index position 0



     //B
        // we can search arrays

        /*
        one of the ways we can search through arrays is the sequential method
        the other way is a binary method / Arrays Method

        the sequential method just uses a normal array to check using an if statement (Line 40 in LottoTicket class)

        the binary / Arrays Method uses Arrays.binarySearch(); (Line 52 in LottoTicket class)
        for this method we must first sort the array then use the binarySearch to find a specific element we want
        similar to the isEqual to / ==
        * */

     //C
        /*
        some useful tricks with arrays

       we can use a scanner to set the array length such as (on line 12 of Grades class)
       we can then start a method to prompt the user to enter each element of the array (on line 21 of Grades class)

       once weve gotten all the grades we can calculate the sum(Line 28 of Grades class)

       get the average(Line 36 of Grades class)

       get the lowest (Line 45 of Grades class)

       and get the highest(Line 40 of Grades class)

       for the lowest and highest we used two different ways of getting them

       for the highest method (Line 40 of Grades class) we used the Arrays method to sort the array from lowest to highest and pulling the last index position [array.length - 1]
       which we could change the return to give us the lowest as well in index[0]

       for the lowest method (line 45 of Grades class) we used a loop to grab each element in the array and check to see if each of them were lower then the last grade
       once the loop is over the method would then return the lowest grade after the check

       something to note if you try and add an element to an array that the index position is outside of the array length, you will receive an error such as below

       int[] test = new int[2];

       the array length has been set to 2 so only index positions 0 and 1 can be found
       test[0] = 45;
       test[1] = 89;

       test[2] = 55; //this will cause an out of bounds error because you are trying to add an element to an index that doesn't exist

       we can create arrays using objects such as a students like inside the main method (Lines 11-13 in Students class)

       ontop of making arrays of objects we can also make multidimensional arrays
       setup something like below

       int[][] grades = new grades[24][4];

       this would create a array for all 24 students from the student class
       as well as give each student 4 grades each



         */


    }


}
