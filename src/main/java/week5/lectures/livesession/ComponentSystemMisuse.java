package week5.lectures.livesession;

enum FuelType {
    ELECTRIC, PETROL, HYBRID
}

class Engine {
    private int serialNo;
    private String producer;
    private String description;
    private FuelType fuelType;

    private int getSerialNo() {
        return this.serialNo;
    }

    private void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
}

enum GearboxType {
    MANUAL, AUTOMATIC
}

class Gearbox {
    private int serialNo;
    private String producer;
    private String description;
    private GearboxType gearboxType;
}
