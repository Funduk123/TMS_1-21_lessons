import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\allNumbers.txt");
        FileCheck check = new FileCheck(file);
        check.getLines();
        check.checkValid();
    }
}