package pl.sda.mg.oop.zad2;

public class MobilePhone extends MobileDevice {
    private boolean lteSupport;
    public MobilePhone(double sizeOfScreen, int sizeOfRam, int cpu, String system, String deviceType, boolean lteSupport) {
        super(sizeOfScreen, sizeOfRam, cpu, system, deviceType);
        this.lteSupport = lteSupport;
    }
    public void showDeviceInfo(){
        super.showDeviceInfo();
        System.out.println("LTE: " + lteSupport);
    }
}
