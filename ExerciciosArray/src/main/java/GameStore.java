/**
 * @author Cristian
 * @version 1.0.0
 * @since 05/06/2020 - 01:05
 * @category modal
 */
public class GameStore {

    private String nameOfGame;
    private String category;
    private double price;
    private int amount;
    private int rentHours;

    /**
     * explain the empty constructor
     */
    public GameStore() {
    }

    /**
     * Explain the constructor filled
     * @param nameOfGame
     * @param category
     * @param price
     * @param amount
     * @param rentedHours
     */
    public GameStore(String nameOfGame, String category, double price, int amount, int rentedHours) {
        this.nameOfGame = nameOfGame;
        this.category = category;
        this.price = price;
        this.amount = amount;
        this.rentHours = rentedHours;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getRentHours() {
        return rentHours;
    }

    public void setRentHours(int rentedHours) {
        this.rentHours = rentedHours;
    }

    /**
     * if game are rented subtract the number of amount
     */
    public void gameRent() {
        if(getAmount() > 0) {
            setAmount(this.amount - 1);
        } else {
            getAmount();
        }
    }

    /**
     * if game are back add to amount
     */
    public void gameBack() {
        setAmount(this.amount + 1);
    }

    /**
     * the metod calculate the value on stock of gamestore
     * @return the multiply of amount and price
     */
    public double valueInStock() {
        return amount * price;
    }

    /**
     * This metod calculate the value the client will pay
     * @param hours
     * @return the result from price multiply by hours
     */
    public double priceToPay(int hours) {
        return getPrice() * hours;
    }

    /**
     * register the hours the game are rented all the time
     * @param hours
     */
    public void rentedHours(int hours) {
        this.setRentHours(hours + this.rentHours);
    }

    /**
     * Explain toString of this class
     * @return the attributes of this class
     */
    @Override
    public String toString() {
        return "\nName Of Game: " + nameOfGame
              + "\nCategory: " + category
              + "\nPrice: " + price
              + "\namount: " + amount
              + "\nrentedHours: " + rentHours;
    }
}