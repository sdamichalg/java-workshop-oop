package pl.sda.mg.oop.zad2;

public class MobileDevice {
    private double sizeOfScreen;
    private int sizeOfRam, cpu;
    private String system, deviceType;

    public MobileDevice(double sizeOfScreen, int sizeOfRam, int cpu, String system, String deviceType) {
        this.sizeOfScreen = sizeOfScreen;
        this.sizeOfRam = sizeOfRam;
        this.cpu = cpu;
        this.system = system;
        this.deviceType = deviceType;
    }
    public void showDeviceInfo(){
        System.out.println("wielkość wyświetlacza: " + sizeOfScreen + " '' ");
        System.out.println("Pamięć RAM: " + sizeOfRam + " GB");
        System.out.println("Procesor: " + cpu);
        System.out.println("System operacyjny: " + system);
        System.out.println("Typ urządzenia: " + deviceType);

    }
}
