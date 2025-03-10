package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void testMethod(){
        Masina comanda1 = new Masina("Volvo","XC60","diesel",5,2025);
        comanda1.rezumat();

        System.out.println();

        Masina comanda2 = new Masina("Mercedes","GLA","hybrid",5,2025);
        comanda2.rezumat();

        System.out.println();

        Masina comanda3 = new Masina("BMW","X7","diesel",5,2000,18.300);
        comanda3.rezumat();

    }
}
