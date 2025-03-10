package exempluInterfata;

public class RestaurantVegan extends Restaurant implements Vegan{
    private String bauturiVegane;
    private String deserturiVegane;
    public RestaurantVegan(String nume, String locatie, String meniu, int capacitatePersoane, String bauturiVegane, String deserturiVegane) {
        super(nume, locatie, meniu, capacitatePersoane);
        this.bauturiVegane=bauturiVegane;
        this.deserturiVegane=deserturiVegane;
    }
    public void rezumatRestaurantVegan(){
        infoRestaurant();
        System.out.println("Bauturile vegane sunt: "+bauturiVegane);
        System.out.println("Deserturile vegane sunt: "+deserturiVegane);
    }

    @Override
    public void preparate() {

    }

    @Override
    public void alimenteProaspete() {

    }

    @Override
    public void angajati() {

    }

    @Override
    public void servire() {

    }
}
