package week7.lectures.lecturematerials.interfaces;

// You can implement as many interfaces as you need
interface Animable {
    // All attributes are static and final so
    // it makes no sense (in most occasions) to
    // have attributes in the interface
    String name = "MyName";
    int age = 123;

    String makeNoise();
    default void sayYourName() {
        System.out.println("My name is " + name);
    }
}

class Cat implements Animable {
    @Override
    public String makeNoise() {
        return "";
    }
}
