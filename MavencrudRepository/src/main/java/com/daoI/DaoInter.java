package com.daoI;

import org.springframework.data.repository.CrudRepository;

import com.model.Student;

public interface DaoInter extends CrudRepository<Student, Integer> {
public Student findAllByUnameAndPassword(String uname,String password);
public Student findAllBySid(int sid);
}
