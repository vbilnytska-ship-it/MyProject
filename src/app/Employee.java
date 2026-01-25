package app;

public class Employee {

    // приватні поля (інкапсуляція)
    private String pib;
    private String posada;
    private String email;
    private String telefon;
    private int vik;

    // конструктор
    public Employee(String pib, String posada, String email, String telefon, int vik) {
        this.pib = pib;
        this.posada = posada;
        this.email = email;
        this.telefon = telefon;
        this.vik = vik;
    }

    // гетери (за потреби)
    public String getPib() {
        return pib;
    }

    public String getPosada() {
        return posada;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getVik() {
        return vik;
    }
}
