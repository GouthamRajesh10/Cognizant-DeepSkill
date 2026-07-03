import java.util.*;
public class financialForecast{
    public static void main(String[] args){
        recurFinance ff = new recurFinance();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value, rate and years");
        double currentVal = sc.nextInt();
        int rate = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(ff.forecast(currentVal,rate,year));

    
    }
}
class recurFinance{
    public double forecast(double currentVal, int rate, int year){
        if(year==0){
            return currentVal;
        }     
        return forecast(currentVal*(1+(rate/100.0)),rate,year-1);
    }
}