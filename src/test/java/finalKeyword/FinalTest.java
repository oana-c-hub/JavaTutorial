package finalKeyword;

import org.testng.annotations.Test;

public class FinalTest {
    //Variabila = proprietate care isi poate  odifica valoarea
    //Constanta = proprietate care nu isi poate modifica valoare
    //Scopul unei constante poate sa fie acela de a pastra aceleasi valori in intreg proiectul

    public final String user="@";
    public  final String password="123";

    @Test
    public void loginTest(){
        System.out.println("Userul s-a logat cu succes folosind user: "+user+" si parola "+password);

//        user="ggg";
//        password="111";
//        System.out.println("Userul s-a logat cu succes folosind user: "+user+" si parola "

    }
}
