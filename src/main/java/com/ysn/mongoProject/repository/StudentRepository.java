package com.ysn.mongoProject.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ysn.mongoProject.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long>{

}
