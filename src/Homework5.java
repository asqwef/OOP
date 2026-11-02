class PersonalComputer {
    Monitor moni = new Monitor("32 inch", "Black", "45W");
    Computer pc = new Computer("Core i7", "32GB", "2TB", "White", "700W");
    public void turnOn() {
        pc.computerTurnOn();
        moni.monitorTurnOn();
    }
    public void getInfo() {
        pc.computerInfo();
        moni.monitorInfo();
    }
}
class Monitor {
    private final String monitorSize, color, power;

    Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void monitorTurnOn() {
        System.out.println("Turning on the monitor");
    }

    public void monitorInfo() {
        System.out.println("The spec of monitor");
        System.out.println("  Size: " + monitorSize);
        System.out.println("  Color: " + color);
        System.out.println("  Power: " + power);
    }
}
class Computer {
    private final String cpu, memory, hd, color, power;
    Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void computerTurnOn() {
        System.out.println("Turning on the computer");
    }
    public void computerInfo() {
        System.out.println("The spec of the computer");
        System.out.println("  CPU: "+cpu);
        System.out.println("  Memory: "+memory);
        System.out.println("  HDD: "+hd);
        System.out.println("  Color: "+color);
        System.out.println("  Power: "+power);
    }
}
public class Homework5 {
    static void main(String[] args) {
        PersonalComputer test = new PersonalComputer();
        test.turnOn();
        test.getInfo();
    }
}
