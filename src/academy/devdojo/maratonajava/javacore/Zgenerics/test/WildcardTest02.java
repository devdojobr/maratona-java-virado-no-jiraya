package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animals = new ArrayList<>();

        printConsulta(cachorros);
        printConsulta(gatos);
        printConsultaCachorro(cachorros);
        printConsultaCachorro(animals);
    }
    //Type erasure
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaCachorro(List<? super Cachorro> animals) {
        for (Object animal : animals) {
            if(animal instanceof Cachorro){
                Cachorro c = (Cachorro) animal;
                c.consulta();
            }
        }
    }

    private static void customSort(List<? extends Comparable> list){
        Collections.sort(list);
    }
}
