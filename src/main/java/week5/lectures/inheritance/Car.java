package week5.lectures.inheritance;

enum CarBrand {
    BMW, AUDI, VW
}

class Car extends Vehicle{
    private CarBrand brand;

    @Override
    public void produceNoise(){
        System.out.println("I'M PRODUCING A CAR NOISE");
    }

    public Car(double speed, int numOfWheels, CarBrand brand) {
        super(speed, numOfWheels);
        this.brand = brand;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }
}
