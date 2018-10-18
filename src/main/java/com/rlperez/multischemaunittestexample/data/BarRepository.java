package com.rlperez.multischemaunittestexample.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BarRepository extends JpaRepository<Integer, Foo> {
}
