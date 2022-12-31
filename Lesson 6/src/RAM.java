public class RAM {
    String name;
    String amount;
    public RAM() { }
    public RAM(String name, String amount) {
        this.name = name;
        this.amount = amount;
    }

    public String ramCheck() {
        if (name == null) {
            return "Информация отсутствует";
        } else {
            return ramOut(); }
    }
    public String ramOut() {
        return this.name + ", " + this.amount;
    }
}