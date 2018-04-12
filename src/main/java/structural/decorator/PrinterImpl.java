package structural.decorator;

public class PrinterImpl implements Printer {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
