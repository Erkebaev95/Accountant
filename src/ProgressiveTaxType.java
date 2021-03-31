public class ProgressiveTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        // Прогрессивный налог
        if(amount <= 100000) {
            return amount * 0.1;
        } else if (amount > 100000) {
            return amount * 0.15;
        }
        return 0.0;
    }
}