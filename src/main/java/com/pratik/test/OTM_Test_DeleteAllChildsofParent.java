package com.pratik.test;

import com.pratik.dao.OTM_DAO;
import com.pratik.dao.OTM_DAOFactory;
import com.pratik.utility.HibernateUtil;

public class OTM_Test_DeleteAllChildsofParent {
	public static void main(String[] args) {
		OTM_DAO dao=null;
		//get DAO
		dao=OTM_DAOFactory.getInstance();
		//save objs
		dao.deleteAllChildsOfAParent();
		//close objs
		HibernateUtil.closeSession();
		HibernateUtil.closeSessionFactory();
	}//main
}//class
