package Mukemmel_sayi;

public class MAIN {
    public static void main(String[] args) {
        MukemmelSayi number=new MukemmelSayi(28);
        if (number.isPerfect()){
            System.out.println(number.getValue()+"mükemmel sayı");
        }else {
            System.out.println(number.getValue()+"mukemmel sayı değil");
        }
    }
}
