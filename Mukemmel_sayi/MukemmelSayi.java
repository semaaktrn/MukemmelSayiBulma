package Mukemmel_sayi;

public class MukemmelSayi extends Sayi{
    public MukemmelSayi(int value){
        super(value);
    }
    public boolean isPerfect(){
        int sum=0;
        for (int i=1;i<getValue();i++){
            if (getValue()%i==0){
                sum +=i;
            }
        }
        return  sum==getValue();
    }
}
