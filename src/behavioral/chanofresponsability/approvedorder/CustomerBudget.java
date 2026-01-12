package behavioral.chanofresponsability.approvedorder;

public class CustomerBudget {

    private boolean approved;
    private final int totalValue;

    public CustomerBudget(int totalValue) {
        this.totalValue = totalValue;
    }

    public boolean isApproved() {
        return approved;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "CustomerBudget{" +
                "approved=" + approved +
                ", totalValue=" + totalValue +
                '}';
    }
}
