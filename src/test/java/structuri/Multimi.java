package structuri;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //Multimi =  array, list, map

    @Test

    public void testMethod() {
        //  afisareColegi();
        //  afisareColegi2();
        afisareProduse();
        afisareProduseV2();
        carteRetete();

    }

    //Afisam numele colegilor de la curs

    public void afisareColegi() {
        String[] colegi = new String[10];
        colegi[0] = "Roxana";
        colegi[1] = "Oana";
        colegi[2] = "Florentina";
        colegi[3] = "Ana";
        colegi[4] = "Natalia";

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului meu este: " + colegi[index]);

        }
    }

    public void afisareColegi2() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Roxana");
        colegi.add("Oana");
        colegi.add("Florentina");
        colegi.add("Ana");
        colegi.add("Natalia");

        for (int index = 0; index < colegi.size(); index++) {
            System.out.println("Numele colegului meu este: " + colegi.get(index));
        }
    }

    //Map = key - value

    public void afisareProduse() {
        Map<String, String> raion = new HashMap<>();
        raion.put("Raftul 1", "Paine");
        raion.put("Raftul 2", "Cereale");
        raion.put("Raftul3", "Ciocolata");

        for (String key : raion.keySet()) {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsul de pe raftul curent este: " + raion.get(key));
        }
    }

    public void afisareProduseV2() {
        Map<String, List<String>> raion = new HashMap<>();

        List<String> produseRaft1 = new ArrayList<>();
        produseRaft1.add("mere");
        produseRaft1.add("pere");
        produseRaft1.add("prune");

        List<String> produseRaft2 = new ArrayList<>();
        produseRaft2.add("apa");
        produseRaft2.add("lapte");
        produseRaft2.add("suc");

        List<String> produseRaft3 = new ArrayList<>();
        produseRaft3.add("oua");
        produseRaft3.add("branza");
        produseRaft3.add("paine");

        raion.put("Raft 1", produseRaft1);
        raion.put("Raft 2", produseRaft2);
        raion.put("Raft 3", produseRaft3);

        for (String key : raion.keySet()) {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsele de pe raftul curent sunt: " + raion.get(key));

        }
    }

    public void carteRetete() {
        Map<String, List<String>> retete = new HashMap<>();

        List<String> ingredienteCiorba = new ArrayList<>();
        ingredienteCiorba.add("pui");
        ingredienteCiorba.add("legume");
        ingredienteCiorba.add("apa");

        List<String> ingredienteSarmale = new ArrayList<>();
        ingredienteSarmale.add("varza");
        ingredienteSarmale.add("carne");
        ingredienteSarmale.add("orez");

        List<String> ingredienteClatite = new ArrayList<>();
        ingredienteClatite.add("oua");
        ingredienteClatite.add("lapte");
        ingredienteClatite.add("faine");

        retete.put("ciorba", ingredienteCiorba);
        retete.put("sarmale", ingredienteSarmale);
        retete.put("clatite", ingredienteClatite);

        for (String key : retete.keySet()) {
            System.out.println("Pentru a face " + key + " avem nevoie de: ");
            System.out.println(retete.get(key));

        }
    }
}
