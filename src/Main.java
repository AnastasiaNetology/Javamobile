public class Main {

    public static void main(String[] args) {

        int amount = 100;

        int refill = 1100;

        int finalScore;
        finalScore = amount + refill;

        System.out.println("Количество бонусных рублей:");
        if (refill > 1000) {
            System.out.println(refill / 100);
        }

        int bonuses = finalScore / 100;

        System.out.println("Итоговый счет:");
        System.out.println(finalScore);
    }
}
