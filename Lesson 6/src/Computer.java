public class Computer {
    int cost;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(int cost, String model) {
        ram = new RAM();
        hdd = new HDD();
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }


    public void out() {
        System.out.println("_______________________________");
        System.out.println("Информация о компьютере");
        System.out.println("Стоимость: " + this.cost);
        System.out.println("Модель: " + this.model);
        System.out.println("Оперативная память: " + ram.ramCheck());
        System.out.println("Жетский диск: " + hdd.hddCheck());
        System.out.println("_______________________________");
    }

}
