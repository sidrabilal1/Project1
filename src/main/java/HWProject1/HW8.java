package HWProject1;

public class HW8 {
    public static void main(String[] args) {

        int [] numbers= {10,20,15,25,5,35,45,65};
        int max= numbers[0];
        int min= numbers[0];
        for(int i =1; i < numbers.length; i++){

            if(numbers[i] > max){
                max=numbers[i];
            }
            if(numbers[i] < min){
                min=numbers[i];
            }
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
    }
}
