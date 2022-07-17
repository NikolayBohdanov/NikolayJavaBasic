package homeWork19.Task3;

@Dao
public class Bet {
    @Inject
    private int betValue = 100;
    private double risk = 2.5;
    @Inject
    private String customerID = "A1";
    private String customerName = "default";

    public Bet() {
    }

    public Bet(int betValue) {
        this.betValue = betValue;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "betValue=" + betValue +
                ", customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public Bet(int betValue, String customerID, String customerName) {
        this.betValue = betValue;
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int getBetValue() {
        return betValue;
    }

    public void setBetValue(int betValue) {
        this.betValue = betValue;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private void printData() {
        System.out.println("Customer data is: Name: " + customerName + ", ID: " + customerID + ".");
    }
}
