import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste) {
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
        List<String> toList = liste.stream().map((n) -> n.toUpperCase()).collect(Collectors.toList());
        return toList;
    }

    public List exercice2(List<String> liste) {
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
        List<String> listeTriee = liste.stream().filter((n) -> n != "INUTILE").collect(Collectors.toList());
        return listeTriee;
    }

    public String exercice3(List<String> liste) {
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        return liste.stream().collect(Collectors.joining());
    }


    public String exercice4(List<String> liste) {
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */


        return liste.stream().map((n) -> n.toUpperCase()).filter((n) -> !n.equals("AAA")).collect(Collectors.joining());
    }

    public List exercice5(List<Integer> liste) {
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */

        return liste.stream().map((n) -> n * 2).collect(Collectors.toList());
    }

    public Integer exercice6(List<Integer> liste) {
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        return liste.stream().reduce((acc, nouveau) -> acc * nouveau).get();
    }

    public List exercice7(List<Integer> liste) {
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */

        return liste.stream().filter((n) -> Math.pow(n, 2) > 50).collect(Collectors.toList());
    }

    public List exercice8(List<Integer> liste) {
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        return liste.stream().map((n) -> (n * 9)).map((n) -> String.valueOf(n)).map((n) -> n.charAt(0)).collect(Collectors.toList());
    }

    public List exercice9() {
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        List<Integer> liste = IntStream.iterate(1, (n) -> n + 1).filter((n) -> n % 3 == 0 && n % 7 == 0).limit(10).boxed().collect(Collectors.toList());
        return liste;
    }

    public List exercice10() {
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        List<Integer> liste = IntStream.iterate(1, (n) -> n + 1).map((n) -> n * n).limit(20).boxed().collect(Collectors.toList());
        return liste;
    }
}
