package com.cnietsche.portsAdapters.repositories;

import com.cnietsche.portsAdapters.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


}
