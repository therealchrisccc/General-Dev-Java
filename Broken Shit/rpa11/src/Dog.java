public class Dog extends Animal{

    public boolean playFetch() {
        return true;
    }

    public Dog() {
        this.says = "Woof";
    }

    public Dog(String name) {
        super(name);
        this.says = "Woof";
    }
}
