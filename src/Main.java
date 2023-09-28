public class Main {
    public static void main(String[] args) {
        int amount = 25654; // стоимость билета
        int bonus = 20; // количество рублей для одной бонусной мили

        System.out.println("За покупку билета начислено милей:" + (amount / bonus));
    }
}