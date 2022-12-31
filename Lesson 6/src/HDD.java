public class HDD {
    String name;
    String amount;
    String type;
    public HDD() { }
    public HDD(String name, String amount, String type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    public String hddCheck() {
        if (name == null) {
            return "Информация отсутствует";
        } else {
            return hddOut(); }
    }

    public String hddOut() {
        return name + ", " + amount + " гб" + ", тип - " + type;
    }
}
