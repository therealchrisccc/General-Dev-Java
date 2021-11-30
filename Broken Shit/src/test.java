public class test{
public static char[] classArr;
public static void threeLoops() {
    int value = 0;
    StringBuilder build = new StringBuilder();
    do {
        build.append(value++);
    }while(value++ < 10);
    System.out.println(build.toString()); // line 1

    String motto = "What's the motto with you?";
    String motto2 = motto;
    while(motto2.contains("motto")) {
        motto2 = motto.replace("motto", "matter");
    }
    System.out.println(motto2.equalsIgnoreCase(motto)); // line 2

    String count = "0123456789";
    int counter = 0;
    for(int i = 0; i < count.length(); i++) {
        int tmp = Character.digit(count.charAt(i), 10); // converts character to int
        if(tmp % 2 == 0) counter++;
    }
    System.out.println(counter); // line 3
}
public static void main(String[] args) {
    int i = 10;

do {

   System.out.println("Line: " + i);

}while (i++ < 10);

System.out.println("end");
}
}