package week5.lectures.inheritance;

class Vehicle {
    private double speed;
    private int numOfWheels;

    public Vehicle(double s, int numOfWheels){
        this.speed = s;
        this.numOfWheels = numOfWheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void produceNoise(){
        System.out.println("GENERIC VEHICLE NOISE");
    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("hello");
    }
    public Test(String name, int age){}
}
enum Gender{
    FEMALE, MALE
}