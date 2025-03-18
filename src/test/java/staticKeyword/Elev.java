package staticKeyword;

public class Elev {
    //Static = keyword care poate sa fie folosoit la proprietati sau metode
    //Scopul acestui keyword este sa iti dea posibilitatea sa accesezi proprietatea/metoda fara a avea nevoie de un obiect de tipul clasei
    //In momentul cand o proprietate este statica, toate obiectele au aceiasi valoare pentru ea
    //In momentul in care o metoda este statica o putem accesa folosind numele clasei
    // Este recomandat sa nu abuzam de static, si sa il folosim cel mai des la logica pentru utilitare
    // Static provoaca foarte rar probleme cand vine vorba de executii in paralel

    private String nume;
    private String prenume;
    private int varsta;
    private String clasa;
    private static String scoala="Liviu Rebreanu";
    private static int idElev=0;

    public Elev(String nume, String prenume, int varsta, String clasa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.clasa = clasa;
        idElev++;
    }
    public void infoElev(){
        System.out.println("Nume: "+nume);
        System.out.println("Prenume: "+prenume);
        System.out.println("Varsta: "+varsta);
        System.out.println("Clasa: "+clasa);
        System.out.println("Scoala: "+scoala);
        System.out.println("Id elev: "+idElev);

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }
}
