public class Main {

    public static void main(String[] args) {

        int amount = 400;

        int refill = 800;

        int finalScore;
        finalScore = amount + refill;

        System.out.println("Количество бонусных рублей:");
        if (finalScore > 1000) {
            System.out.println(finalScore / 100);
        }

        int bonuses = finalScore / 100;

        System.out.println("Итоговый счет:");
        System.out.println(finalScore);
    }
}
