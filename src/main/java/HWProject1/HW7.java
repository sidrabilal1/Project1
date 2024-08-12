package HWProject1;

public class HW7 {
    public static void main(String[] args) {

    int n =10;
    int firstNum =0, secondNum=1;
        System.out.println("Fibonacci Series till "+n+" numbers: ");
        for(int i =1; i<=n; ++i){
            System.out.println(firstNum+" ");
            int nextNum = firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
    }
}
