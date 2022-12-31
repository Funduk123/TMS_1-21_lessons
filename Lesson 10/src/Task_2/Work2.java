package Task_2;

public class Work2 {

    public static void strSplit(String str) {
        String[] words = str.trim().split(" ");
        String shortWord = "";
        String longWord = "";
        int a = str.length();
        int b = 0;
        for (String word : words) {
            if (word.length() <= a) {
                shortWord = word;
                a = word.length();
            }
            if (word.length() >= b) {
                longWord = word;
                b = word.length();
            }
        }
            System.out.println("Самое длинное слово: " + longWord);
            System.out.println("Самое короткое слово: " + shortWord);
        }
}
