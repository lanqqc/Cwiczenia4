import java.util.Scanner;

class Car {
    private String modelPN;
    private String markaPN;
    private float rokPN;
    private float cenaPN;
    private String kolorPN;
    private float iloscPN;

    public Car (String model, String marka, float rok, float cena, String kolor, float ilosc){
        setModelPN(model);
        setMarkaPN(marka);
        setRokPN(rok);
        setCenaPN(cena);
        setKolorPN(kolor);
        setIloscPN(ilosc);
    }

    public void setModelPN (String data){
        this.modelPN = data;
    }

    public void setMarkaPN (String data){
        this.markaPN = data;
    }

    public void setRokPN (float data){
        this.rokPN = data;
    }

    public void setCenaPN (float data){
        this.cenaPN = data;
    }

    public void setKolorPN (String data){
        this.kolorPN = data;
    }

    public void setIloscPN (float data){
        this.iloscPN = data;
    }

    public String getModelPN (){
        return modelPN;
    }

    public String getMarkaPN (){
        return markaPN;
    }

    public float getRokPN(){
        return rokPN;
    }

    public float getCenaPN (){
        return cenaPN;
    }

    public String getKolorPN (){
        return kolorPN;
    }

    public float getIloscPN (){
        return iloscPN;
    }

    public void deliveryPN(){
        //this.iloscPN += 1;
        this.iloscPN++;
    }

    public void sellPN(){
        this.iloscPN--;
    }

    public void toStringPN(){
        System.out.println("model: " + modelPN + " marka: " + markaPN + " rok: " + rokPN + " cena: " + cenaPN +
                " kolor: " + kolorPN + " ilosc: " + iloscPN);
    }
}

public class ZwracanieInformacji{

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "10i", 2003, 20000, "red", 10);
        car1.toStringPN();
        car1.sellPN();
        System.out.println("Ilosc: " + car1.getIloscPN());
        car1.setCenaPN(10000);
        car1.toStringPN();
    }
}

