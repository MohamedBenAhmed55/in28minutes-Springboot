package com.in28minutes.rest.webservices.restful_web_services.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoJpaRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUsername(String username);
}
