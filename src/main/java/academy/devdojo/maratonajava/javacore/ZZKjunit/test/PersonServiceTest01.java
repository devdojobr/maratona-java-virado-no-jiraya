package academy.devdojo.maratonajava.javacore.ZZKjunit.test;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));

    }
}
