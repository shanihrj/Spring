package com.daoI;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Location;


public interface DaoInter extends JpaRepository<Location, Integer> {
/*public Student findAllByUnameAndPassword(String uname,String password);
public Student findAllBySid(int sid);*/
}
