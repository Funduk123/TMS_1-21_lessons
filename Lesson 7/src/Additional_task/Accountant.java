package Additional_task;

public class Accountant implements Profession{
    @Override
    public void profShow(String s) {
        System.out.println("Бухгалтер " + s);
    }
}
