abstract class Printer {
    private String model;
    private int printedCount = 0;
    private int availableCount;
    public Printer(String m, int a) {
        model = m;
        availableCount = a;
    }
    public void setModel(String m) { model = m; }
    public void setPrintedCount(int p) { printedCount = p; }
    public void setAvailableCount(int a) { availableCount = a; }
    public String getModel() { return model;}
    public int getPrintedCount() { return printedCount; }
    public int getAvailableCount() { return availableCount; }
    abstract public boolean print();
}
class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int acount) {
        super(model, acount);
    }
    @Override
    public boolean print() {
        if (getAvailableCount() <= 0) {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", getModel(), getPrintedCount() + 1);
            return false;
        }
        else {
            setPrintedCount(getPrintedCount()+1);
            setAvailableCount(getAvailableCount() - 1);
            return true;
        }

    }
}
class LaserPrinter extends Printer {
    public LaserPrinter(String model, int acount) {
        super(model, acount);
    }

    @Override
    public boolean print() {
        if (getAvailableCount() <= 0) {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", getModel(), getPrintedCount() + 1);
            return false;
        } else {
            setPrintedCount(getPrintedCount() + 1);
            setAvailableCount(getAvailableCount() - 1);
            return true;
        }
    }
}
public class Homework7 {
    static void main() {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
