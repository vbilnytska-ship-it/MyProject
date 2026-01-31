package app;

public class ConsolePrinter implements Printer {

    // 🔹 Статичний внутрішній клас
    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    // 🔹 Реалізація методу print
    @Override
    public void print(Message message) {

        // якщо message == null або обидва поля null → анонімний клас
        if (message == null ||
                (message.getText() == null && message.getSender() == null)) {

            Printer emptyHandler = new Printer() {
                @Override
                public void print(Message m) {
                    System.out.println(
                            "Опрацьовується пусте повідомлення від анонімного користувача..."
                    );
                }
            };

            emptyHandler.print(message);
            return;
        }

        // якщо sender пустий або null
        if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println(
                    "Анонімний користувач відправив повідомлення: "
                            + message.getText()
            );
        } else {
            System.out.println(
                    "Користувач " + message.getSender()
                            + " відправив повідомлення: "
                            + message.getText()
            );
        }
    }
}