package Additional_task;

public class Director implements Profession{
    @Override
    public void profShow(String s) {
        System.out.println("Директор " + s);
    }
}
