package be.intecbrussel;

public class MoneyApp{
    public static void main(String[] args) {
        Coin myCoin = Coin.ONE_EURO;
        Coin mySecondCoin = Coin.TEN_CENT;
        // Coin thisWillNotWork = new Coin();

//        System.out.println(myCoin);
//        System.out.println(mySecondCoin);

//        for (Coin value : Coin.values()) {
//            System.out.println(value.name() + " - " + value.ordinal() + " - " + value);
//        }

        Coin fiveCent = Coin.valueOf("FIVE_CENT");
        System.out.println(fiveCent);

    }
}
