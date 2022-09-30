package com.sparta.week02;

import com.sparta.week02.domain.Person;
import com.sparta.week02.domain.PersonRepository;
import com.sparta.week02.domain.PersonRequestDto;
import com.sparta.week02.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}

	// JPA 실행 코드
	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
		return (args) -> {
			personRepository.save(new Person("최예진", 23, "대한민국", "학생"));

			System.out.println("데이터 인쇄");
			List<Person> personList = personRepository.findAll();
			for (int i=0; i<personList.size(); i++) {
				Person person = personList.get(i);
				System.out.println(person.getId());
				System.out.println(person.getName());
				System.out.println(person.getAge());
				System.out.println(person.getAddress());
				System.out.println(person.getJob());
			}

			PersonRequestDto requestDto = new PersonRequestDto("최이진", 23, "용산구", "학생");
			personService.update(1L, requestDto);
			personList = personRepository.findAll();
			for (int i=0; i<personList.size(); i++) {
				Person person = personList.get(i);
				System.out.println(person.getId());
				System.out.println(person.getName());
				System.out.println(person.getAge());
				System.out.println(person.getAddress());
				System.out.println(person.getJob());
			}

			// personRepository.deleteAll();
		};
	}
}
