package temaAbstractizare1;

public class PachetSpa extends Afacere implements Spa{
    private String accesGym;
    private String accesMasaj;
    public PachetSpa(String nume, String adresa, int zileLucratoare, String accesGym, String accesMasaj ) {
        super(nume, adresa, zileLucratoare);
        this.accesGym=accesGym;
        this.accesMasaj=accesMasaj;
    }
    public void rezumatSpa(){
        infoAfacere();
        System.out.println("Pachetul Spa Simple include: "+accesGym);
        System.out.println("Pachetul Spa Enjoy include: "+accesMasaj);
    }

    @Override
    public void accesPiscina() {

    }

    @Override
    public void accesSauna() {

    }

    @Override
    public void accesServiciiCosmetica() {

    }
}
