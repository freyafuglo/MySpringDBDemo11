package com.example.myspringdbdemo11.Service;

import com.example.myspringdbdemo11.Model.Person;
import com.example.myspringdbdemo11.Repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonService
{
    @Autowired
    PersonRepo personRepo;
    public List<Person> fetchAll()
    {
        return personRepo.fetchAll();
    }

    public void addPerson(Person p)
    {
        personRepo.addPerson(p);
    }

    public Person findPersonById(int id)
    {
        return personRepo.findPersonById(id);
    }

    public Boolean deletePerson(int id)
    {
        return personRepo.deletePerson(id);
    }

    public void updatePerson(int id, Person p)
    {
        personRepo.updatePerson(id, p);
    }
}
