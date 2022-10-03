package Accounts;

import regestration.Regestration;

public class amountSaved  extends Regestration{


    private int accountFunds = 40000;

    //amount saved by each user
    //assuming each member has stayed for six months


    public int amountSavedByUser(){
        int totalAmount = getRegAmount() + (250*6);
        return totalAmount;
    }

    public int getAccountFunds() {
        return accountFunds;
    }


}
