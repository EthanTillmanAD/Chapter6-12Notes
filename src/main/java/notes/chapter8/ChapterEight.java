package notes.chapter8;



public class ChapterEight {
   int x = 5; //primative
   Integer y = 3; // wrapper

    /*
   primative dataTypes such as int, double, long, boolean
   ALL primative dataTypes have a wrapper classes/ objects

    wrapper classes/ objects have methods we can use already such as below, in line 17 method



     */

    public static void convertDecToInt(){
        double[] numbers = {4.3,5.5,6,.5,55.0};// using double as a primative

        for (Double i : numbers){//this converts it from its primative to the wrapper class allowing for methods to be used
            System.out.println(i.intValue());// such as the .intValue() if we were to change the wrapper double on line 20
        }                                    //we wouldn't be allowed to use that method because its no longer getting an instance =
    }                                        //of the wrapper class



  public static void testingWrapperClasses(){
        Integer x = 999;
        double j = 5.4;

        ;
      System.out.println(x.describeConstable());
      System.out.println(Double.isInfinite(j));// we could also use the ClassName.Method since wrapper classes are objects
      //                                      and their methods are static we can use it for our work such as on line 33
  }

    public static void main(String[] args) {
      //  convertDecToInt();
        testingWrapperClasses();

        String str = "abc";

        char data[] = {'a','b','c'};// both this line and line 41 do the same thing
        String str2 = new String(data);

        System.out.println(str);
        System.out.println(str2);
    }




}
