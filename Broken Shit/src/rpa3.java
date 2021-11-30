public class rpa3 {
    public static void main(String[] args) {
        System.out.println(formatterC("Monkey", 10));
        System.out.println(formatterC("Monkey", 3));
        System.out.println(happinessCheck(10, 9));
    }
    public static String formatterC(String str, int d) {
        return String.format("%" + d + "s", str);
    }
    public static String happinessCheck(int puppyCounter, int stressLevel){
        String highStress = "Too much stress, not enough puppies!!";
        String paradise = "Perfect amount of pupppers";
        String actualParadise = "Can you really have to many puppies?";

        if (stressLevel >= 5){
            if (puppyCounter == stressLevel){
                return paradise;
            }
            else if (puppyCounter > 5){
                return actualParadise;
            }
            else if (puppyCounter < 1){
                return "Super tragic, no puppies :(";
            }
        } else if (stressLevel >= 10){
            return highStress;
        } else if (stressLevel < 5){
            return paradise;
        }
        return highStress;
    }
}
