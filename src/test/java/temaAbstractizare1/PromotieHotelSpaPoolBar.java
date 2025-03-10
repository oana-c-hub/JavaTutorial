package temaAbstractizare1;

public class PromotieHotelSpaPoolBar extends Afacere implements Hotel,Spa,PoolBar{
    private int discountFidelizare;
    private int discountOutOfSeason;
    public PromotieHotelSpaPoolBar(String nume, String adresa, int zileLucratoare, int discountFidelizare, int discountOutOfSeason) {
        super(nume, adresa, zileLucratoare);
        this.discountFidelizare=discountFidelizare;
        this.discountOutOfSeason=discountOutOfSeason;
    }
    public void rezumatPromotieHotelSpaPoolBar(){
        infoAfacere();
        System.out.println(discountFidelizare+"% discount pentru rezervari multiple");
        System.out.println(discountOutOfSeason+"% discount pentru rezervari in afara sezonului");
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
    public void meniuCocktails() {

    }

    @Override
    public void meniuBrunch() {

    }

    @Override
    public void allInclusive() {

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
