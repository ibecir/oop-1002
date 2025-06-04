package week15.lectures.designpatterns;

class Vehicle {
    private String model;
    private int year;
    private boolean isElectric;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    public static class VehicleBuilder {
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

// Example usage
class Main {
    public static void main(String[] args) {
        Vehicle tesla = new Vehicle.VehicleBuilder("Tesla Model 3")
                .setYear(2022)
                .setIsElectric(true)
                .build();

        System.out.println("Model: " + tesla.getModel());
        System.out.println("Year: " + tesla.getYear());
        System.out.println("Is Electric: " + tesla.getIsElectric());
    }
}
