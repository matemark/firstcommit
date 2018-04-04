package com.company.dao;

import com.company.Model.Person;

import java.util.List;

public interface IPersonDao {

    public List<Person> getAllPersons();
    public void save(Person p);
}
