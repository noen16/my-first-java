package no.rohde.myfirstjava.controller;

import no.rohde.myfirstjava.modell.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyFirstController {

    @GetMapping
    public List<Person> getPerson() {


        List<Person> persons = new ArrayList<>();
        Person ulrik = new Person();
        Person frode = new Person();


        frode.setFirstName("Frode");
        frode.setLastName("Sjovatsen");

        ulrik.setFirstName("Ulrik");
        ulrik.setLastName("Rohde");

        persons.add(ulrik);
        persons.add(frode);

        return persons;
    }
}
