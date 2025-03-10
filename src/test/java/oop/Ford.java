package oop;

import java.util.List;

public class Ford extends Masina{

    private List<String> dotariExterioare;
    private List<String> dotariInterioare;
    public Ford(String marca, String model, int anFabricatie, String combustibil, int pret, List<String> dotariExterioare, List<String> dotariInterioare) {
        super(marca, model, anFabricatie, combustibil, pret);
        this.dotariInterioare=dotariInterioare;
        this.dotariExterioare=dotariExterioare;
    }
    public void rezumatFord(){
        rezumatComanda();
        System.out.println("Datoarile interioare  sunt: "+dotariInterioare);
        System.out.println("Dotarile exterioare sunt: "+dotariExterioare);
    }
    //Polomorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masinile ford pornesc cu amprenta");
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    public List<String> getDotariInterioare() {
        return dotariInterioare;
    }

    public void setDotariInterioare(List<String> dotariInterioare) {
        this.dotariInterioare = dotariInterioare;
    }
}
