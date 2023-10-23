public class Main {
    public static void main(String[] args) {

        int amount = 300;                   //текущий счет абонента до пополнения
        int refill = 1500;                  //сумма пополнения
        int bonusCoef = 100;                //бонусный расчет
        int finalScore = amount + refill;   //итоговый счет (текущий счет + сумма пополнения)
        int bonuses = refill / bonusCoef;   //итоговый бонус

        if (refill >= 1000){
            bonuses = refill / bonusCoef;
        } else {
            bonuses = 0;
        }

        System.out.println("Количество бонусных рублей:");
        System.out.println("" + bonuses);
        System.out.println("Итоговый счет:");
        System.out.println(finalScore + bonuses);
    }
}
