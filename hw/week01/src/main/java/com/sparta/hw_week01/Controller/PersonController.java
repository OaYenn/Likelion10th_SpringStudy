package com.sparta.hw_week01.Controller;

import com.sparta.hw_week01.Person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("최예진");
        person.setAge(23);
        person.setAddress("대한민국");
        person.setJob("대학생");
        return person;
    }
}
