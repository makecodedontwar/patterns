package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Printer normalPrinter = new PrinterImpl();

        normalPrinter.print("abc");


        Printer reversedPrinter = new ReversedPrinter(normalPrinter);

        reversedPrinter.print("abc");

        Printer upperCasePrinter = new UppperCasePrinter(reversedPrinter);

        upperCasePrinter.print("abc");
    }
}
