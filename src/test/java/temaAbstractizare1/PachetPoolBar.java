package temaAbstractizare1;

public class PachetPoolBar extends Afacere implements PoolBar{
    private String meniuCopii;
    private String meniuVegan;
    private int happyHour;
    public PachetPoolBar(String nume, String adresa, int zileLucratoare,String meniuCopii,String meniuVegan, int happyHour) {
        super(nume, adresa, zileLucratoare);
        this.meniuCopii=meniuCopii;
        this.meniuVegan=meniuVegan;
        this.happyHour=happyHour;
    }
    private void rezumatPoolBar(){
        infoAfacere();
        System.out.println("Meniul pentru copii este: "+meniuCopii);
        System.out.println("Meniul pentru vegani este: "+meniuVegan);
        System.out.println("Happy Hour incepe la ora: "+happyHour);
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
