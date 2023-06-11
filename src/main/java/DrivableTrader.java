import java.util.List;


public class DrivableTrader extends Trader<Drivable> {

    /**
     * Construct a DrivableTrader, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money){
        super(inventory, wishlist, money);
    }


    /**
     * Construct a DrivableTrader, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable obj){
        if (obj instanceof Tradable) {
            int price = ((Tradable) obj).getPrice();
            int speed = obj.getMaxSpeed();
            return price + speed;
        }
        return Tradable.MISSING_PRICE;
    }
}
