package com.serviceInter;

import java.util.ArrayList;

import com.model.Student;

public interface ServiceI {
public void saveStudent(Student st);
public int logincheck(Student st);
public int deleteStudent(Student st);
public ArrayList<Student>displayAll(Student st);
public Student editStudent(Student st);
public int updateStudent(Student st);

}
