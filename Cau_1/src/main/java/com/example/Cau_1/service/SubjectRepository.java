package com.example.Cau_1.service;

import com.example.Cau_1.entity.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Integer> {
    @Query(value = "Select * from subjects p where p.subid = ?1", nativeQuery = true)
    public Subject getSubject(String subId);
}
