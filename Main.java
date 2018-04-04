package com.company;

import com.company.Model.Adress;
import com.company.Model.Person;
import com.company.dao.PersonDao;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PersonDao db = new PersonDao();

        Person p = new Person();
        p.setId(12);
        p.setName("kasia");
        p.setSurname("Szmata");

        Adress a = new Adress();
        a.setId(1);
        a.setCity("Kurwiki Dolne");
        a.setStreet("Ruchable 69");

        p.setAdress(a);

        Person z = new Person();
        z.setId(2);
        z.setName("Jasiek");
        z.setSurname("Ronaldo");
        z.setAdress(a);

        System.out.println("hello");
        db.save(p);
        db.save(z);
        System.out.println(db.getAllPersons());
        for(Person x : db.getAllPersons()){
            System.out.println(x.getId());
            System.out.println(x.getName());
            System.out.println(x.getSurname());
            System.out.println(x.getAdress().getCity());
        }
    }
}
