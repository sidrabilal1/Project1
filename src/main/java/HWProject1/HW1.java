package HWProject1;

public class HW1 {
    public static void main(String[] args) {
        int [] temperature = {90,80,75,100,120,40,108};
        int maxtemp =temperature[0];
        int minTemp =temperature[0];

        for(int temp:temperature){
            if(temp>maxtemp){
                maxtemp=temp;
            }
            if(temp<minTemp){
                minTemp=temp;
            }
        }
        System.out.println("Highest temperature: "+maxtemp);
        System.out.println("Lowest temperature "+minTemp);
    }
}
