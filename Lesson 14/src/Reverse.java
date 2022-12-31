public class Reverse {
    private final String str;

    public Reverse(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.str);
        return "Строка после реверса: " + stringBuilder.reverse();
    }
}
