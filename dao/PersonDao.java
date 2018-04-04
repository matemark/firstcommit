package com.company.dao;

import com.company.Model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao implements IPersonDao{

    private List<Person> db = new ArrayList<Person>();

    public List<Person> getAllPersons() {
        return db;
    }

    public void save(Person p) {
        db.add(p);
    }
}
