package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person person){
//        Objects.requireNonNull(person, "Person can't");
        if(person == null){
            throw new IllegalArgumentException();
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingNotAdult(List<Person> personList){
        return personList.stream().filter(this::isAdult).collect(Collectors.toList());
    }
}
