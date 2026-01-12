import behavioral.chanofresponsability.approvedorder.CustomerBudget;
import behavioral.chanofresponsability.approvedorder.handlers.CEOBudgetHandler;
import behavioral.chanofresponsability.approvedorder.handlers.DirectorBudgetHandler;
import behavioral.chanofresponsability.approvedorder.handlers.ManagerBudgetHandler;
import behavioral.chanofresponsability.approvedorder.handlers.SellerBudgetHandler;

import static java.lang.IO.println;

void main() {
    CustomerBudget customerBudget = new CustomerBudget(10);

    var sellerBudget = new SellerBudgetHandler();
    sellerBudget
            .setNextHandler(new ManagerBudgetHandler())
            .setNextHandler(new DirectorBudgetHandler())
            .setNextHandler(new CEOBudgetHandler());

    sellerBudget.handler(customerBudget);
    println(customerBudget);
}
