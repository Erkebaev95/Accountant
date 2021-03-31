public class Main {
    public static void main(String[] args) {
        TaxService taxService;
        VATaxType vaTaxType;
        IncomeTaxType incomeTaxType;
        ProgressiveTaxType progressiveTaxType;
        Bill[] payments = new Bill[] {
                new  Bill(100000, new VATaxType(), new TaxService()),
                new  Bill(180000, new IncomeTaxType(), new TaxService()),
                new  Bill(175000, new ProgressiveTaxType(), new TaxService()),
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}