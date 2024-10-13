package notes.chapter6;

public class ChapterSix {
    public static int overLoadingMethods(int x){// static Methods
        /**Just like constructors methods can also be overloaded
         * such as these two examples they have the same methodName
         * but do different things, (PARAMETERS MUST BE DIFFERENT)
         *
         *  public static String overLoadingMethods(int x){
         *
         *         return x;
         *     }
         *
         *     the example above wont work again because we already have one
         *     below but if we added in  the same but add the parameter
         *     String y we could have 3 overloaded parameterized methods
        **/

        return x + 5;
    }

    public static String overLoadingMethods(String x){

        return x;
    }

}
