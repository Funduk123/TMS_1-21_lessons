public class Exc555 extends Exception {
    public static void exc(String doc) throws Exc555 {
        if (!doc.startsWith("555")) {
            throw new Exc555();
        }
        System.out.println("Номер документа начинается с '555'");
    }
    @Override
    public String toString() {
        String message = "Номер документа не начинается с '555'";
        return "Ошибка: " + message;
    }
}