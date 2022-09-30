package com.sparta.week02.controller;

import com.sparta.week02.domain.Person;
import com.sparta.week02.domain.PersonRepository;
import com.sparta.week02.domain.PersonRequestDto;
import com.sparta.week02.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class PersonController {

    private final PersonRepository personRepository;

    //    API - GET
    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    //    API - POST, PUT, DELETE
    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        // requestDto : 생성 요청. 강의제목/튜터이름 정보를 가져온다.
        // 강의 데이터는 @RequestBody로 표시
        // 참고 : 클라이언트 -> 서버 요청 : @RequestBody
        //       서버 -> 클라이언트 응답 : @ResponseBody

        // Dto의 정보를 person에 담음
        Person person = new Person(requestDto.getName(), requestDto.getAge(), requestDto.getAddress(), requestDto.getJob());

        // JPA 이용하여 DB에 저장, 결과 반환
        return personRepository.save(person);
    }
    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @GetMapping("/api/persons/{id}")
    public Person getOnePerson(@PathVariable Long id){
        return personRepository.findById(id).get();
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }
}
