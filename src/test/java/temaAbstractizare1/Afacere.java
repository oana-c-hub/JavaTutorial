package temaAbstractizare1;

public class Afacere {
    private String nume;
    private String adresa;
    private int zileLucratoare;

    public Afacere(String nume, String adresa, int zileLucratoare) {
        this.nume = nume;
        this.adresa = adresa;
        this.zileLucratoare = zileLucratoare;
    }
    public void infoAfacere(){
        System.out.println("Numele afacerii este: "+ nume);
        System.out.println("Adresa este: "+adresa);
        System.out.println("Zilele in care este deshis sunt:"+zileLucratoare);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getZileLucratoare() {
        return zileLucratoare;
    }

    public void setZileLucratoare(int zileLucratoare) {
        this.zileLucratoare = zileLucratoare;
    }
}
