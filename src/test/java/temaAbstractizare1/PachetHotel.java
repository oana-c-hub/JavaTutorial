package temaAbstractizare1;

public class PachetHotel extends Afacere {
    private String pachetPaste;
    private String pachetCraciun;
    public PachetHotel(String nume, String adresa, int zileLucratoare, String pachetPaste,String pachetCraciun) {
        super(nume, adresa, zileLucratoare);
        this.pachetPaste=pachetPaste;
        this.pachetCraciun=pachetCraciun;
    }
    public void rezumatHotel(){
        infoAfacere();
        System.out.println("Pachetul promotional de Paste contine: "+pachetPaste);
        System.out.println("Pachetul promotional de Craciun contine: "+pachetCraciun);
    }
}
