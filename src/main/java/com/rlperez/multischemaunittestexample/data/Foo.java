package com.rlperez.multischemaunittestexample.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "FOO", schema = "A")
public class Foo {
    @Id
    private int id;

    private String name;
}
