package week15.lectures.livesessionv2;

public class Vehicle {
    private String model;
    private int year;
    private boolean isElectric;

    public boolean isElectric() {
        return isElectric;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    static class VehicleBuilder {
        private String model;
        private int year;
        private boolean isElectric;

        public VehicleBuilder(String model) {
            this.model = model;
        }

        public VehicleBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public VehicleBuilder setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}

class RunMee {
    public static void main(String[] args) {
        Vehicle golf = new Vehicle.VehicleBuilder("Golf").build();

        Vehicle golf2 = new Vehicle.VehicleBuilder("Golf 2 16 ventila")
                .setYear(2025)
                .setIsElectric(true)
                .build();

        System.out.println(golf.getModel());
        System.out.println(golf2.getModel());
    }
}
