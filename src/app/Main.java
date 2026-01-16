package app;


class Person {
    String name;
    int age;
    String profession;

    // Конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public void printInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }


    public void setProfession(String newProfession) {
        profession = newProfession;
    }
}

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("John", 30, "Інженер");
        Person p2 = new Person("Mary", 25, "Вчитель");
        Person p3 = new Person("Bob", 35, "Лікар");


        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        System.out.println();


        Person p4 = new Person("Alice", 28, "Архітектор");
        p4.printInfo();


        p4.setProfession("Дизайнер");

        System.out.println("(Після оновлення професії)");
        p4.printInfo();
    }
}
