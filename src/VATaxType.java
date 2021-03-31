public class VATaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        // НДС
        return amount * 0.18;
    }
}