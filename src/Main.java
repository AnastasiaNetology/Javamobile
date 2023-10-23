public class Main {

    public static void main(String[] args) {

        int amount = 300;     //счет
        int refill = 1500;    //сумма пополнения
        int bonusCoef = 100;  //бонусный коэффициент
        int finalScore;
        finalScore = amount + refill;

        System.out.println("Количество бонусных рублей:");
        if (refill >= 1000) {
            System.out.println(refill / bonusCoef);
        }
        if (refill < 1000) {
            System.out.println(refill = 0);
        }

        int bonuses = refill / bonusCoef;

        System.out.println("Итоговый счет:");
        System.out.println(finalScore + bonuses);
    }
}
