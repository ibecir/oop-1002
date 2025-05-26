package week13.lectures.builder;

class MainRun {
    public static void main(String[] args) {
        ProblemHouse fadilsHouse = new ProblemHouse("a", 400, "My nice pool", 100.00, "Nice garden" );
        ProblemHouse becirHouse = new ProblemHouse("a", 0, null, 0, null);

        House fadilsLuxaryHouse = new House.HouseBuilder("Oxford Street", 1000)
                .setHasSwimmingPool(true)
                .setHasGarage(true)
                .setHasGarden(true)
                .build();

        House becirsSmallHouse = new House.HouseBuilder("Francuske revolucije bb", 50)
                .build();
    }
}

class ProblemHouse {
    private String address;
    private double size;
    private String swimmingPool;
    private String garden;
    private int garage;

    public ProblemHouse(String address, int garage, String garden, double size, String swimmingPool) {
        this.address = address;
        this.garage = garage;
        this.garden = garden;
        this.size = size;
        this.swimmingPool = swimmingPool;
    }
}

class House {
    private String address;
    private double size;
    private boolean hasSwimmingPool;
    private boolean hasGarage;
    private boolean hasGarden;

    public House(HouseBuilder builder) {
        this.address = builder.address;
        this.size = builder.size;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    static class HouseBuilder {
        private String address;
        private double size;
        private boolean hasSwimmingPool;
        private boolean hasGarage;
        private boolean hasGarden;

        public HouseBuilder(String address, double size){
            this.address = address;
            this.size = size;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
