public class IncomeTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        // Подоходный налог
        return amount * 0.13;
    }
}