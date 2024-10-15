package notes.chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        //countWords("Hi how are you");
        //reverseText("hello you");

        addSpaces("HelloThisNeedsSpaces");
    }

    private static void addSpaces(String words) {
        var str = new StringBuilder(words);

        for(int i = 0 ; i < str.length(); i++){
            if(i!=0 && Character.isUpperCase(str.charAt(i))){
                str.insert(i, " ");
                i++;
            }
        }
        System.out.println(str);

    }// utilizes Stringbuilder

    private static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;


        String message = String.format("Your message has %d words", numberOfWords);
        System.out.println(message);

        for(String word : words){
            System.out.println(word);
        }


    }//these methods are taking advantage of the String prebuilt methods

    private static void reverseText(String text){
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println("");
    }//these methods are taking advantage of the String prebuilt methods
}
