package HWProject1;

public class HW9 {
    public static void main(String[] args) {

        int [] numbers ={ 10,20,30,40,50,60};
        int largest =numbers[0];
        int secondLargest = numbers[0];
        for(int i = 1; i<numbers.length; i++){
            if(numbers[i]>largest) {
                secondLargest = largest;
                largest = numbers[i];

            }else if(numbers[i]> secondLargest && numbers[i]!= largest){
                secondLargest = numbers[i];

            }
        }
        System.out.println("Second largest :"+secondLargest);
    }
}
