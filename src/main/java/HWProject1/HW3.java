package HWProject1;

public class HW3 {
    public static void main(String[] args) {
        int [][] numbers= {
                {3,10,12},
                {2,5,25},
                {5,10,8}

        };
        System.out.println("Even numbers in the array: ");
        for(int [] row:numbers){
            for(int num:row){
             if(num%2==0)  {
                 System.out.println(num+" ");
             }
            }
        }
        }

    }



