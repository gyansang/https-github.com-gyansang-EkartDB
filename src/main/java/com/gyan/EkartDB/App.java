package com.gyan.EkartDB;

import model.DAO.user_data_DAO;
import model.Entity.user_data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	user_data u1 = new user_data(1, "12345", "Sangeeta", 20, "sangeeta455472@gmail.com", "8445030640", "Mainpuri UP", "205203", "Female");
    	user_data_DAO ud = new user_data_DAO();
    	
    	boolean b = ud.enter_user_data(u1);
    	if(b)
    	{
    		System.out.println( "Record instered successfully!" );
    	}
    	else
    	{
    		System.out.println( "Record could not be instered!!! Please try again!" );
    	}
    }
}
