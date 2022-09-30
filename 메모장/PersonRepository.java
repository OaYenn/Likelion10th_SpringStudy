package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
} // extends : 클래스의 상속. 상속받은 클래스의 멤버변수와 메소드를 가져다 쓴다.
