package com.capgemini.onlinemedicalstorecollection.database;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;

public class AdminUserDB {
	
public static ArrayList<AdminUserBean> database() {
		
		 ArrayList<AdminUserBean> adminUserBean = new ArrayList<AdminUserBean>();
	//public static ArrayList<AdminUserBean> adminUserBean;
 	AdminUserBean adminBean = null;
 		
	
		AdminUserBean admin = new AdminUserBean();
		admin.setId(1);
		admin.setName("ameya");
		admin.setEmail("amyp@gmail.com");
		admin.setPassword("apatil123");
		admin.setType("admin");
		
		AdminUserBean admin2 = new AdminUserBean();
		admin2.setId(2);
		admin2.setName("rutu");
		admin2.setEmail("rutu@gmail.com");
		admin2.setPassword("rpatil");
		admin2.setType("admin");
		
		AdminUserBean user1 = new AdminUserBean();
		user1.setId(101);
		user1.setName("omkar");
		user1.setEmail("omya@gmail.com");
		user1.setPassword("omya1234");
		user1.setType("user");
		
		AdminUserBean user2 = new AdminUserBean();
		user2.setId(104);
		user2.setName("abbu");
		user2.setEmail("abbu@gmail.com");
		user2.setPassword("qwerty");
		user2.setType("user");
		
		adminUserBean.add(admin);
		adminUserBean.add(admin2);
		adminUserBean.add(user1);
		adminUserBean.add(user2);
		
		
		return adminUserBean;
	}

}
