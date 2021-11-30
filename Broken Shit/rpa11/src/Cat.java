public class Cat extends Animal{

    public boolean hasRetractableClaws() {
        return true;
    }

    public Cat(String name) {
        super(name);
        says = "Meow";
    }
}
