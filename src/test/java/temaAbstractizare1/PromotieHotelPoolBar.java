package temaAbstractizare1;

public class PromotieHotelPoolBar extends Afacere implements Hotel, PoolBar{
    private int discountWeekend;
    private int discountThursday;
    public PromotieHotelPoolBar(String nume, String adresa, int zileLucratoare,int discountWeekend, int discountThursday) {
        super(nume, adresa, zileLucratoare);
        this.discountWeekend=discountWeekend;
        this.discountThursday=discountThursday;
    }
    private void rezumatPromotieHotelPoolBar(){
        infoAfacere();
        System.out.println(discountWeekend+" % discount in weekend");
        System.out.println(discountThursday+" % discount joi seara");
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
}
