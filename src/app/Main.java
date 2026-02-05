package app;

public class Main {
    public static void main(String[] args) {
        Advisor advisor = new SimpleAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}
