package structural.decorator;

public class UppperCasePrinter extends PrinterDecorator {
    public UppperCasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String str) {
        super.print(str.toUpperCase());
    }
}
