package Task_3;

public class Work3 {
    public static void string3 (String str) {
        String[] words = str.split(" ");
        StringBuilder fullString = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                fullString.append(word.charAt(i)).append(word.charAt(i));
            }
        }
        System.out.println("Через Билдер: " + fullString);
    }

    public static void string4 (String str) {
        String fullString = "";
            for (int i = 0; i < str.length(); i++) {
                fullString += str.charAt(i);
                fullString += str.charAt(i);
        }
        System.out.println("Без Билдера: " + fullString);
    }
}
