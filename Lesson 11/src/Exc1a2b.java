public class Exc1a2b extends Exception {
    public static void exc(String doc) throws Exc1a2b {
        if (!doc.endsWith("1a2b")) {
            throw new Exc1a2b();
        }
        System.out.println("Номер документа заканчивается на 1a2b!");
    }

    @Override
    public String toString() {
        String message = "Номер документа не заканчивается на 1a2b!";
        return "Ошибка: " + message;
    }
}