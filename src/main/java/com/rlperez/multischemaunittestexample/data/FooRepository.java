package com.rlperez.multischemaunittestexample.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Integer, Foo> {
}
