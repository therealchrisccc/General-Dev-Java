public class fuck {
    public String stringManipulation(String input){
        String temp = "";
        int counter = 0;
        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(i) == input.charAt(j)){
                    counter ++;

                }
            }
            temp += (Character.toString(i) + counter);
            }
            return temp;
        }
    public void main(String[] args){
        System.out.print(stringManipulation("blueberry"));
    }
}
