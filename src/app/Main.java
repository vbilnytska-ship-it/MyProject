package app;

public class Main {
    public static void main(String[] args) {

        ConsolePrinter printer = new ConsolePrinter();

        // звичайне повідомлення
        ConsolePrinter.Message m1 =
                new ConsolePrinter.Message("Привіт!", "Валерія");

        // анонімний відправник
        ConsolePrinter.Message m2 =
                new ConsolePrinter.Message("Таємне повідомлення", null);

        // пусте повідомлення
        ConsolePrinter.Message m3 =
                new ConsolePrinter.Message(null, null);

        printer.print(m1);
        printer.print(m2);
        printer.print(m3);
    }
}