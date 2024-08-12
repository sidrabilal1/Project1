package HWProject1;

public class HW10 {
    public static void main(String[] args) {
      String [] arrays ={ "Toyota","Mercedes","Honda","BMW","Mercedes"};
        System.out.println("Duplicate element in the array:");
        for(int i =0; i< arrays.length; i++){
            for(int j = i+1; j< arrays.length; j++)
            if (arrays[i].equals(arrays[j])){
                System.out.println(arrays[i]);
            }
        }
    }
}
