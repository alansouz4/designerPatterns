package behavioral.chanofresponsability.approvedorder.handlers;

import behavioral.chanofresponsability.approvedorder.BaseBudgetHandler;
import behavioral.chanofresponsability.approvedorder.CustomerBudget;

import static java.lang.IO.println;

public class CEOBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handler(CustomerBudget budget){
        println("O CEO tratou qualquer orçamento");
        budget.setApproved(true);
        return budget;
    }
}
