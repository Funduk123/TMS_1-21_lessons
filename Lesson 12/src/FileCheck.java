import java.io.*;

public class FileCheck {
    private final File file;
    public FileCheck(File file) {
        this.file = file;
    }

    public void getLines() {
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println("Все номера документов файла:");
            while ((str = bufferedReader.readLine()) != null) {
                    System.out.println(str);
            }
            bufferedReader.close();
            System.out.println("-----------------------------------------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("Ошибка! Не удалость прочесть файл.");
        }
    }

    public void checkValid() {
        deleteFiles();
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\validNumbers.txt", true));
            while ((str = bufferedReader.readLine()) != null) {
                if (str.length() == 15) {
                    if (str.startsWith("docnum") || str.startsWith("contract")) {
                        bufferedWriter.write(str + "\n");
                        System.out.println(str);
                    }
                } else { checkInvalid(); }
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkInvalid() {
        deleteFiles();
        try {
            String str;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\invalidNumbers.txt", true));
            System.out.println("Все инвалиды:");
            while ((str = bufferedReader.readLine()) != null) {
                if (str.length() != 15) {
                    str = str + " - неверное количество символов";
                }
                if (!str.startsWith("docnum") && !str.startsWith("contract")) {
                    bufferedWriter.write(str + ", не начинается с нужной последовательности\n");
                    System.out.println(str + ", не начинается с нужной последовательности");
                }
            }
            System.out.println("-----------------------------------------------------------------------------------------");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteFiles() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\invalidNumbers.txt", false));
            bufferedWriter.write("");
            bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\validNumbers.txt", false));
            bufferedWriter.write("");

        } catch (Exception e) {
            System.err.println("Ошибка в очистке файлов: " + e.getMessage());
        }
    }

//    public void work() {
//        try {
//            String str;
//            // Считывание данных файла со всеми номерами документов
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\allNumbers.txt"));
//            System.out.println("Валидные документы: ");
//            // Разделение содержимого файла на подстроки
//            while ((str = bufferedReader.readLine()) != null) {
//                String[] list = str.split(" ");
//                // Проверка на содержание последовательности и вывод валидных номеров документов
//                for (String s : list) {
//                    if (s.startsWith("docnum") || s.startsWith("contract")) {
//                        System.out.printf("%s", s);
//                        System.out.println();
//                        // Запись валидных номеров документов в валидный файл
//                        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\validNumbers.txt", true))) {
//                            bufferedWriter.write(s + "\n");
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        // Запись невалидных номеров документов в невалидный файл
//                        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\danik\\Desktop\\Courses\\Lesson 12_27.10.2022\\src\\invalidNumbers.txt", true))) {
//                            bufferedWriter.write(s + "\n");
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//            bufferedReader.close();
//        } catch (IOException exc) {
//            System.out.println("Ошибка!");
//        }
//    }

}
