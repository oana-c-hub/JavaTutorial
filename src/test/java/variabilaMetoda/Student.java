package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //intr-un fisier java recunoastem o clasa dupa cuvantul "class"
    //orice clasa trebuie sa aiba un nume
    //intr-un fisier java putem avea mai multe clase diferentiate prin nume
    //nu este un best practice sa ai mai multe clase intr-un fisier
    //tot codul care apartine unei clase se regaseste  intre acolade
    //clasa=sablon care contine variabile si metode despre un anumit exemplu
    //intr-o clasa putem sa avem n variabile si n metode
    //proprietate=variabila in java
    //variabila=proprietatea unei clase
    //exista doua tipuri de variabile:globala si locala
    //variabila globala=proprietate care este vizibila peste tot in programul nostru
    //structura variabila globala:public tip variabila nume variabila;
    //variabila locala=proprietate care este vizibila doar in locul in care ai declarat-o
    //structura variabila locala: tip variabila nume variabila;
    // nu este obligatoriu ca o variabila sa aiba o valoare
    //in java exista conceptul de primitiva si non primitiva
    //primitiva se bazeaza pe initializarea unei valori in functie de tipul de date definit
    //non primitiva se bazeaza pe instantierea unei variabile prin referinta
    //metoda=actiuea unei clase
    //exista doua tipuri de metode: void si return
    //structura metoda void: public void nume metoda () {}
    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    @Test
    public void prezentareStudent(){
        nume= "Calitoiu";
        prenume= "Oana";
        varsta= 39;
        adresa= "Craiova nr.9";
        inaltime= 1.79;
        greutate=  70.1f;
        sex= 'F';
        areBursa= true;

        System.out.println("Numele si prenumele studentului sunt: "+nume+' '+prenume);
        System.out.println("Vasrsta studentului este "+varsta);
        System.out.println("Adresa studentului este: "+adresa);
        System.out.println("Inaltimea studentului este: "+inaltime);
        System.out.println("Greutatea studentului este: "+greutate);
        System.out.println("Sexul studentului este: "+sex);
        System.out.println("Studentul are bursa? "+areBursa);

        calculMedieStudent3(9,8,9);
        calculMedieStudent3(6,7,6);
        calculMedieStudent3(10,10,10);
    }

    //o noua metoda care calculeaza media unui student
    //o metoda poate sau nu sa contina parametrii
    public void calculMedieStudent3(double nota1, double nota2, double nota3){

        double medie=(nota1+nota2+nota3)/3;
        System.out.println("Media studentului este "+medie);
    }
}
