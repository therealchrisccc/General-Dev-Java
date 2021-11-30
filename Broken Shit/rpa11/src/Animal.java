public class Animal {

    private String name;
    protected String says = "UNKNOWN";

    public String getName() {
        if(name != null && !name.isEmpty()) {
            return name;
        }
        return "The " + this.getClass().getSimpleName(); // return simple name of instance class
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return String.format("%s says %s", getName(), says);
    }
    public Animal() {}

    public Animal(String name) {
        this();
        setName(name);
    }

}