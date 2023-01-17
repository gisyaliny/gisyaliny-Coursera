package interface;

public class TaxCollector {
    public static void main(String[] args) {
        TaxPayer[] taxPayers = {
            new EmployedPerson("Billy", "ssn-1123"),
            new MomPopShop("coffeshop", "corp-id")
        };

        double taxesCollectedAmt = 0;

        for (TaxPayer taxPayer : taxPayers){
            taxesCollectedAmt += taxPayer.payTaxes();
        }

        System.out.printf("Taxes : $%.2f",taxesCollectedAmt);


    }
    
}
