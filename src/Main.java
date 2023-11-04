public class Main {
    public static void main(String[] args) {
        int startMoney = 100; // текущая сумма на счету клиента
        int addingSumm = 1100; // сумма пополнения
        boolean biggerThan1000 = addingSumm > 1000; //проверка, пополнил ли клиент на сумму, большую, чем 1000р

        int bonus = biggerThan1000 ? addingSumm / 100 : 0;

        int summary = startMoney + addingSumm + bonus;

        System.out.println("Ваш итоговый счет " + summary + "р");
        System.out.println("Количество бонусных рублей " + bonus + "р");
    }
}