package pl.sda.mg.oop.zad2;

public class Tablet extends MobileDevice{
    private boolean  pencilSupport;
    public Tablet(double sizeOfScreen, int sizeOfRam, int cpu, String system, String deviceType, boolean pencilSupport) {
        super(sizeOfScreen, sizeOfRam, cpu, system, deviceType);
        this.pencilSupport = pencilSupport;
    }
    public void showDeviceInfo(){
        super.showDeviceInfo();
        System.out.println("rysik: " + pencilSupport);
    }
}
