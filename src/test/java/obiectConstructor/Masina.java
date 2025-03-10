package obiectConstructor;

public class Masina {
    //Constructor= are ca rol sa initializeze variabelele unei clase
    //Exista doua tipuri de constructori: default( nu are parametri/nu este definit) sau cu parametri
    //Structura constructor: public( de cele mai multe ori), nume clasa, cu sau fara parametri
    //Intr-o clasa putem avea mai multi constructori diferentiati prin numarul sau tipul de parametri
    //Obiect=instanta unei clase
    //Dintr-o clasa putem sa definim mai multe obiecte pe care sa le diferentiem dupa nume
    //In momentul in care instantiem un obiect se apeleaza constructorul clasei respective
    //Un obiect se instantieaza folosind cuvantul "new"
    //Un obiect instantiat are posibilitatea sa acceseze proprietatile/metodele din clasa respectiva

    public String marca;
    public String model;
    public String motorizare;
    public int numarLocuri;
    public int anulFabricatiei;
    public double pret;

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anulFabricatiei, double pret) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
        this.pret = pret;
    }

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anulFabricatiei) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anulFabricatiei = anulFabricatiei;
    }



    public void rezumat(){
        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Motorizarea masinii este "+motorizare);
        System.out.println("Numarul de locuri pe care le are masina sunt "+numarLocuri);
        System.out.println("Anul de fabricatie a masinii este "+anulFabricatiei);

        if(pret!=0){
            System.out.println("Pretul masinii este"+pret);
        }
    }

}
