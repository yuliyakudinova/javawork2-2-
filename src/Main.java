
public class Main {
    public static void main(String[] args) {

        int initialAccount = 100;
        int accountReplenishment = 700;
        int bonus= accountReplenishment / 100;

        if (accountReplenishment >= 1000){
            bonus = accountReplenishment /100;
        }
        else {
            bonus = 0;
        }
        int totalAmount = initialAccount + accountReplenishment + bonus;
        System.out.println("Общий счет: " + totalAmount);
        System.out.println( "Ваши бонусы: " + bonus);


    }
}
