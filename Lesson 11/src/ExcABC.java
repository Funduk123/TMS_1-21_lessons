public class ExcABC extends Exception {
    public static void exc(String doc) throws ExcABC {
        if (!doc.contains("abc") && !doc.contains("ABC")) {
            throw new ExcABC();
        }
        System.out.println("Документ содержит 'ABC' или 'abc'");
    }
    @Override
    public String toString() {
        String message = "Номер документа не содержит 'ABC' или 'abc'";
        return "Ошибка: " + message;
    }
}