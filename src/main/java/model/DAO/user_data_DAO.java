package model.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.mapping.List;

import config.DbConfig;
import model.Entity.user_data;

public class user_data_DAO {
	
	private DbConfig db;
	private Session sess;
	private Transaction tc;
	
	public user_data_DAO()
	{
		db = new DbConfig();
		sess = db.getSess();
	}
	
	public boolean enter_user_data(user_data user1)
	{
		boolean b = true;
		try
		{
			tc = sess.beginTransaction();
			sess.save(user1);
			tc.commit();
		}
		catch(Exception e)
		{
			tc.rollback();
			b = false;
			e.printStackTrace();
		}
		return b; 
	}
}
