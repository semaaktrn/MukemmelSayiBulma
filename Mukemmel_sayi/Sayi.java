package Mukemmel_sayi;

public class Sayi {
    private int value;
    public Sayi(){}

    public Sayi(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value>=0) {//negatif değer girmesini engeller

            this.value = value;
        }else{
            System.out.println("negatif değer kabul edilemez");
        }
    }
//temel işlemler veya ortak metodlar burya gelebilir
}
