package misc;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hi there    find the words count";

        int result = count(str);
        String[] strArr = str.split(" ");
        System.out.println("Number of words : "+ result);
    }

    private static int count(String str) {
        int result =0;
        boolean wordStarts=false,wordEnds=false;

        for (int i = 0; i <str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                wordStarts=true;
            } else if (wordStarts && !Character.isLetter(str.charAt(i))) {
                wordEnds=true;
                wordStarts=false;
                result++;
            } else if (wordEnds && Character.isLetter(str.charAt(i))) {
                wordStarts=true;
            }
        }

        return result;
    }
}
