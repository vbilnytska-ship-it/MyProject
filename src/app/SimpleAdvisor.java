package app;

public class SimpleAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Focus on work, plan your tasks and stay productive.");
                break;

            case FRIDAY:
                System.out.println("Happy Friday!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend! You can visit a park, cafe or watch a movie.");
                break;
        }
    }
}


