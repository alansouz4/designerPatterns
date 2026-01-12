package behavioral.chanofresponsability.approvedorder.handlers;

import behavioral.chanofresponsability.approvedorder.BaseBudgetHandler;
import behavioral.chanofresponsability.approvedorder.CustomerBudget;

import static java.lang.IO.println;

public class DirectorBudgetHandler extends BaseBudgetHandler {

    public CustomerBudget handler(CustomerBudget budget){
        if(budget.getTotalValue() <= 50000) {
            println("O diretor tratou o orçamento");
            budget.setApproved(true);
            return budget;
        }
        return super.handler(budget);
    }
}
