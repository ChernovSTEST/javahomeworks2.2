public class Main {
    public static void main(String[] args) {

        int balance = 137;
        int payment = 5432;
        int bonus;
        if (payment < 1000)
            bonus = 0;
        else
            bonus = payment / 100;
        int total = balance + payment + bonus;
        System.out.println("Balance=" + total);
        System.out.println("Bonus=" + bonus);
    }
}