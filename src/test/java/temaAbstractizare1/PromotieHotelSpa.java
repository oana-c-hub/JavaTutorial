package temaAbstractizare1;

public class PromotieHotelSpa extends Afacere implements Hotel, Spa{
    private int discountJuniorSuite;
    private int discountSeniorSuite;
    public PromotieHotelSpa(String nume, String adresa, int zileLucratoare, int discountJuniorSuite, int discountSeniorSuite) {
        super(nume, adresa, zileLucratoare);
        this.discountJuniorSuite=discountJuniorSuite;
        this.discountSeniorSuite=discountSeniorSuite;
    }
    public void rezumatPromotieHotelSpa(){
        infoAfacere();
        System.out.println(discountJuniorSuite+"% discount oferit la rezervarile Junior Suite");
        System.out.println(discountSeniorSuite+"% discount oferit la rezervarile Senior Suite");
    }

    @Override
    public void tipCamere() {

    }

    @Override
    public void petFriendly() {

    }

    @Override
    public void perioadaCazare() {

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
