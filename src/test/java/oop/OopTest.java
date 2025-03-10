package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OopTest {
    @Test
    public void testMethod(){
        Volvo comanda1=new Volvo("Volvo","Xc60",2025,"diesel",50500, Arrays.asList("climatron","piele","camera"));
        comanda1.rezumatVolvo();
        comanda1.pornesteMotor();
        System.out.println();

        Volvo comanda2=new Volvo("Volvo","Xc70",2024,"benzina",45000,Arrays.asList("Carlig","amprenta"));
        comanda2.rezumatVolvo();
        System.out.println();

        Dacia comanda3=new Dacia("Dacia","1300",1985,"benzina",1000,Arrays.asList("metalizata","camera"));
        comanda3.pornesteMotor();
        comanda3.rezumatDacia();
        comanda3.aplicareDiscount(10);
        comanda3.aplicareDiscount("Cupon de pensie");
        comanda3.aplicareDiscount();
        
        System.out.println();

        Ford comanda4=new Ford("Ford","Focus",2015,"diesel",22000,Arrays.asList("piele", "clima"),Arrays.asList("camera","vopsea metalizata"));
        comanda4.rezumatFord();
        comanda4.pornesteMotor();

        System.out.println();
    }
}
