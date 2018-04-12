package structural.decorator;

public class ReversedPrinter extends PrinterDecorator {
    public ReversedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String str) {
        super.print(new StringBuilder(str).reverse().toString());
    }
}
