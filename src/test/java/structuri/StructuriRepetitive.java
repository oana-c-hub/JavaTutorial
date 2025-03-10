package structuri;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class StructuriRepetitive {

    //Structuri repetitive=for, while, for each

    @Test
    public void testMethod(){
   //       afisamNnumere();
   //     afisamNnumere2();
   //     afisamNumerePare();
        calculNumere();
    }

    //Afisam primele 10 numere
    public void afisamNnumere(){
        for (int index=0;index<=50;index++){
            System.out.println(index);
        }
    }

    public void afisamNnumere2(){
        int index=0;
        while (index<=50){
            System.out.println(index);
            index++;
        }
    }

    //Afisam numerele pare de la 0 la 50
    public void afisamNumerePare(){
        for(int index=0;index<=50;index++){
            if(index%2==0) {
                System.out.println("Numarul " + index + " este par");
            }
        }
    }

    //Calculam cate nume pare si impare avem intr-un anumit interval
    public void calculNumere(){
        int numerePare=0;
        int numereImpare=0;
        for(int index=0;index<=50;index++){
            if(index%2==0){
                numerePare++;
            }
            else {
                numereImpare++;
            }
        }
        System.out.println("numere pare="+numerePare);
        System.out.println("numere impare="+numereImpare);
    }
}
