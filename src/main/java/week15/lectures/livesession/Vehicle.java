package week15.lectures.livesession;

class Vehicle {
    private String model;
    private int year;
    private boolean isElectric;

    public Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    public boolean getIsElectric() {
        return isElectric;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
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

class CreateMe {
    public static void main(String[] args) {
        Vehicle auto = new Vehicle.VehicleBuilder("SKODA")
                .setYear(1994)
                .setIsElectric(true)
                .build();
        System.out.println(auto.getModel() + " - " + auto.getYear() + " - " + auto.getIsElectric());
    }
}
