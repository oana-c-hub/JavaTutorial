package oop;

public class Masina {
    //oop = programare orientata obiect
    //exista 4 principii = mostenire, incapsularea datelor, polimorfismul si abstractizarea
    //mostenirea = conceptul prin care o clasa(copil) mosteneste o alta clasa(parinte)
    //in java putem mosteni o singura clasa
    //ca sa mostenestesti o clasa folosim cuvandul "extends"
    //in momentul in care clasa copil mosteneste clasa parinte, copilul trebuie sa apeleze constructorul din parinte
    // copilul apeleaza constructorul parinte folosind cuvantul "super"
    //in momentul in care clasa copil mosteneste clasa parinte, copilul are acces la variabile/metode din parinte

    //Incapsulare: conceptul prin care putem defini restrictii la nivel de vizibilitate pentru proprietati/metode
    //Pentru a seta restrictii avem nevoie de acces control de tip private/protected
    //Private=acces control care restrictioneaza vizibilitatea doar la nivel de clasa

    //Polimorfismul: conceptul prin care o metoda poate avea implementari diferite, atat la nivel de body sau structura
    //Plomorfismul este de 2 feluri: dinamic(override) si static(overload)
    //Polimorfismul dinamic: intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polomorfismul static: posibilitatea prin care putem avea mai multe metode cu acelasi nume diferentiate prin numar/tip de parametri


    private String marca;
    private String model;
    private int anFabricatie;
    private String combustibil;
    private int pret;

    public Masina(String marca, String model, int anFabricatie, String combustibil, int pret) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
        this.pret = pret;
    }

    public void rezumatComanda(){
        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul de fabricatie a masini este: "+anFabricatie);
        System.out.println("Combustilul utilizat pentru masina este: "+combustibil);
        System.out.println("Pretul masini este: "+pret);
    }

    //Polimorfism dinamic
    public void pornesteMotor(){
        System.out.println("Masina porneste motorul de la cheie");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    public int getPret() {
        return pret;
    }
}
