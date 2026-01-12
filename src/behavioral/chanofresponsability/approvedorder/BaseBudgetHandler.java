package behavioral.chanofresponsability.approvedorder;

public abstract class BaseBudgetHandler {
    protected BaseBudgetHandler nextHandler = null;

    public BaseBudgetHandler setNextHandler(BaseBudgetHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    protected CustomerBudget handler(CustomerBudget budget){
        if(!budget.isApproved()) {
            return this.nextHandler.handler(budget);
        }
        return budget;
    }
}
