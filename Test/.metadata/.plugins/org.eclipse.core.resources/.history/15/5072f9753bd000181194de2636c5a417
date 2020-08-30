package com.app.DaoImpl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.DaoInterface.DaoInterface;
import com.app.model.User;

@Repository
public class DaoImpl implements DaoInterface {
	List<User> list;
	@Autowired
	SessionFactory sf;
	public int SaveUser(User user) {
     Session session=sf.openSession();
     int id=(int) session.save(user);
     session.beginTransaction().commit();
		return id;
	}
	
	/*public List<User>alldata(){
		
		
	}*/
	public List<User> alldata(User user) {
		Session session=sf.openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<User> query=builder.createQuery(User.class);
		Root<User>root=query.from(User.class);
		query.select(root);
		Query  q1=session.createQuery(query);
		list=	q1.list();
		return list;
	}
	@Override
	public List<User> login(User user) {
		Session session=sf.openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
						javax.persistence.criteria.CriteriaQuery<User> querry =builder.createQuery(User.class);
						
					Root<User>	root=querry.from(User.class);
					
					querry.select(root).where(builder.equal(root.get("username"),user.getUsername()),builder.equal(root.get("password"),user.getPassword()) );
					//querry.multiselect(root.get("username"),root.get("password"));
					Query q1=session.createQuery(querry);
							
				List<User>	list1=q1.list();
				if(!list1.isEmpty())
				{
					
					list=alldata(user);
				}
				return list;
	}

	@Override
	public List<User> delete(User user) {
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		user=session.get(User.class, user.getId());
		session.delete(user);
		t.commit();
	/*	Query q=	session.createQuery("delete User where id='"+user.getId()+"'");
		int i=q.executeUpdate();
		t.commit();
			if(i>0)
			{
				Query q1=session.createQuery("from User");
				list=q1.list();
			}
		return list;*/
		return null;
	}

	

}
