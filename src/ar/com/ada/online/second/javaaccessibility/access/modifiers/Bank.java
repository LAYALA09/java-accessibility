package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class Bank {
    
    private Integer numberAccount;
    private String amount;

    void showAttributeValues(){
        System.out.println("Number Account: " + numberAccount);
        System.out.println("Amount: " + amount);


    }

}
