public class Phone {
    private String number;
    private String model;
    private String weight;
    public void information() {
        System.out.println("Номер: " + this.number + "\nМодель: " + this.model + "\nВес: " + this.weight + " г");
    }

    public String getNumber() {
        return "Номер: " + number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }
    public Phone() { }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name + "\nНомер: " + number);
    }
    public void sendMessage(String... a) {
        System.out.println("Сообщение отправлено на номер(-а): ");
        for (String elem : a) {
            System.out.println(elem);
        }
    }
}
