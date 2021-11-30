public class gen {
    public static void main(String[] args){
int numBoxes  = 0;
int numApples = 9; 

if (numApples < 10) {
    if (numApples < 5) {
       numBoxes = 1;
    }
    else { 
       numBoxes = 2; 
    }
 }
 else if (numApples < 20) {
    numBoxes = numBoxes + 1;
 }
System.out.print(numBoxes);
}
}
