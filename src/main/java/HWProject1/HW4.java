package HWProject1;

public class HW4 {
    public static void main(String[] args) {
        int [][] numbers= {
                {3,10,12},
                {2,5,25},
                {5,10,8}

        };
        int evensum = 0;
        int oddsum = 0;
        for (int[] row:numbers) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evensum = evensum + num;
                } else {
                    oddsum = oddsum + num;

                }
            }
        }
        System.out.println("Sum of even numbers: "+evensum);
        System.out.println("Sum of odd numbers: "+oddsum);

        }

    }



