package com.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoI.DaoInter;
import com.model.Student;
import com.serviceInter.ServiceI;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private DaoInter dao;
	@Override
	public void saveStudent(Student st) {
		// TODO Auto-generated method stub
		dao.save(st);
		
	}

	@Override
	public int logincheck(Student st) {
		// TODO Auto-generated method stub
	String uname=st.getUname();
	String pass=st.getPassword();
	
	Student s=dao.findAllByUnameAndPassword(uname, pass);
	if (s!=null) 
	{
	return 1;	
	}
		
		return 0;
	}

	@Override
	public int deleteStudent(Student st) {
		// TODO Auto-generated method stub
		try {
			dao.delete(st);
			return 1;
		} catch (Exception e) {
		   e.printStackTrace();
		   return 0;
		}
		
	}

	@Override
	public ArrayList<Student> displayAll(Student st) {
		// TODO Auto-generated method stub
	ArrayList<Student>li=(ArrayList<Student>)dao.findAll();
		
		return li;
	}

	@Override
	public Student editStudent(Student st) {
		// TODO Auto-generated method stub
		Student s=dao.findAllBySid(st.getSid());
		
		
		return s;
	}

	@Override
	public int updateStudent(Student st) {
		// TODO Auto-generated method stub
		Student s=dao.save(st);
		
		return s.getSid();
	}

}
