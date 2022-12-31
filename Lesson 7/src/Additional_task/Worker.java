package Additional_task;

public class Worker implements Profession{
    @Override
    public void profShow(String s) {
        System.out.println("Рабочий " + s);
    }
}
