package staticKeyword;

import org.testng.annotations.Test;

public class staticTest {
    @Test
    public void metodaTest(){
        Elev elev1= new Elev("Mircea", "Radu", 15, "7A");
        elev1.infoElev();
        System.out.println();
        Elev elev2= new Elev("Andrei", "Ion", 17, "2B");
        elev2.infoElev();
        System.out.println();
        Elev elev3= new Elev("Ionut", "Maria", 12, "3C");
        elev3.infoElev();

    }
}
