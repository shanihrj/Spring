package com.app.DaoImpl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.Daointerface.DaoInterface;
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
					
					querry.select(root).where(builder.equal(root.get("uname"),user.getUname()),builder.equal(root.get("pass"),user.getPass()) );
				
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
		CriteriaBuilder builder=session.getCriteriaBuilder();
	CriteriaDelete<User> delete=	builder.createCriteriaDelete(User.class);
	Root<User> root=delete.from(User.class);
	delete.where(builder.equal(root.get("Id"), user.getId()));
	Query<User> q=session.createQuery(delete);
		int i=q.executeUpdate();
		t.commit();
		List<User> list = null;
		if(i>0)
		{
		list=alldata(user);
			
		}
		return list;
	}


	@Override
	public User edit(User user) 
		{
			Session session=sf.openSession();
			CriteriaBuilder builder	=session.getCriteriaBuilder();
			javax.persistence.criteria.CriteriaQuery<User>	q=builder.createQuery(User.class);
			Root<User> root=q.from(User.class);
			q.select(root).where(builder.equal(root.get("Id"), user.getId()));
			
			Query<User> q1=session.createQuery(q);
			User use=q1.getSingleResult();
			return use;
		}
		public List<User> update(User user)
		{
			
			Session session=sf.openSession();
		Transaction t=	session.beginTransaction();
			CriteriaBuilder builder=session.getCriteriaBuilder();
			CriteriaUpdate<User>  update=builder.createCriteriaUpdate(User.class);
			Root<User> root=update.from(User.class);
		
			update.set(root.get("name"), user.getName()).set(root.get("city"), user.getCity()).set(root.get("uname"), user.getUname()).set(root.get("pass"), user.getPass());
		
			update.where(builder.equal(root.get("Id"),user.getId()));
			Query<User> q=session.createQuery(update);
			int i=q.executeUpdate();
			t.commit();
			if(i>0)
			{
			list=alldata(user);
			}

			return list;
		}


	

}
