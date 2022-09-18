public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int replenishment = 2000;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(startingScore + replenishment + bonus);
        System.out.println("Бонус="+ bonus);
        System.out.println("Начальный счет=" + startingScore);
        System.out.println("Сумма пополнения=" + replenishment);


    }
}
