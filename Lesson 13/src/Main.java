import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\doc1.txt");
        File file2 = new File("C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\doc2.txt");
        FileCheck doc1 = new FileCheck(file1);
        FileCheck doc2 = new FileCheck(file2);
        doc1.deleteFiles();
        doc1.work();

    }
}