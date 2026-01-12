package behavioral.chanofresponsability.approvedorder.handlers;

import behavioral.chanofresponsability.approvedorder.BaseBudgetHandler;
import behavioral.chanofresponsability.approvedorder.CustomerBudget;

import static java.lang.IO.println;

public class SellerBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handler(CustomerBudget budget){
        if(budget.getTotalValue() <= 1000) {
            println("O vendedor tratou o orçamento");
            budget.setApproved(true);
            return budget;
        }
        return super.handler(budget);
    }
}
