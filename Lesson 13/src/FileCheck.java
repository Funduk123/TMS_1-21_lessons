import java.io.*;
import java.util.*;

public class FileCheck {
    private final File file;

    public FileCheck(File file) {
        this.file = file;
    }

    private List<String> getLines() {
        List<String> allNumbers = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while (bufferedReader.ready()) allNumbers.add(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка! Не удалость прочесть файл.");
        }
        return allNumbers;
    }


    public Set<String> setValid(List<String> allNumbers) {
        Set<String> allCheck = new HashSet<>();
        try {
        BufferedWriter writeValid = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\validNumbers.txt", true));
        BufferedWriter writeInvalid = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\invalidNumbers.txt", true));
            for (String elem : allNumbers) {
                if (elem.length() == 15 && (elem.startsWith("docnum") || elem.startsWith("contract"))) { allCheck.add(elem); writeValid.write(elem + "\n"); }
                else if (elem.length() != 15) { allCheck.add(elem); writeInvalid.write(elem + "\n"); }
                else if (!elem.startsWith("docnum") || !elem.startsWith("contract")) { allCheck.add(elem); writeInvalid.write(elem + "\n"); }
            }
            writeValid.close();
            writeInvalid.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return allCheck;
    }

    private void checkSymbols(Set<String> allCheck) {
        Map<String, String> map = new HashMap<>();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                "C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\result.txt", true))) {
            for (String elem : allCheck) {
                map.put(elem, "валидный");
            }
            for (String elem : allCheck) {
                map.put(elem, "невалидный");
                if (elem.length() != 15) {
                    if (!elem.startsWith("docnum") && !elem.startsWith("contract")) {
                        map.put(elem, " - неверное количество символов, неверная начальная последовательность");
                    } else {
                        map.put(elem, " - неверное число символов");
                    }
                } else {
                    map.put(elem, " - неверная начальная последовательность");
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bufferedWriter.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFiles() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
                    "C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\invalidNumbers.txt", false));
            bufferedWriter.write("");

            bufferedWriter = new BufferedWriter(new FileWriter(
                    "C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\validNumbers.txt", false));
            bufferedWriter.write("");

            bufferedWriter = new BufferedWriter(new FileWriter(
                    "C:\\Users\\danik\\Desktop\\Courses\\Lesson 13_31.10.2022\\src\\result.txt", false));
            bufferedWriter.write("");

        } catch (Exception e) {
            System.err.println("Ошибка в очистке файлов: " + e.getMessage());
        }
    }

    public void work() {

    }
}