package exempluInterfata;

public class RestaurantNonVegan extends Restaurant implements NonVegan{
    private String taraDeProvenientaACarnii;
    private String desertNonVegan;
    public RestaurantNonVegan(String nume, String locatie, String meniu, int capacitatePersoane, String taraDeProvenientaACarnii, String desertNonVegan) {
        super(nume, locatie, meniu, capacitatePersoane);
        this.taraDeProvenientaACarnii=taraDeProvenientaACarnii;
        this.desertNonVegan=desertNonVegan;
    }
    public void rezumatRestaurantNonVegan(){
        infoRestaurant();
        System.out.println("Tara de provenienta a carnii este: "+taraDeProvenientaACarnii);
        System.out.println("Deserturile non-vegane sunt: "+desertNonVegan);
    }

    @Override
    public void tipCarne() {

    }

    @Override
    public void preparateCarne() {

    }

    @Override
    public void timpPreparare() {

    }
}
