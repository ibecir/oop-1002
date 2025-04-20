package week8.lectures.materials;

public class Tiger extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("Tiger eating");
    }
}