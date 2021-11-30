import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(0);
        intArray.remove(0);
        intArray.add(2);

        System.out.println(intArray.size()); 
        // Prints:           



        System.out.println(intArray.get(1)); 
        // Prints:           



        System.out.println(intArray.indexOf(2)); 
        // Prints:           



        System.out.println(intArray.contains(1)); 
        // Prints:           



        intArray.clear();
        System.out.println(intArray.size()); 
        // Prints:           


    }
}