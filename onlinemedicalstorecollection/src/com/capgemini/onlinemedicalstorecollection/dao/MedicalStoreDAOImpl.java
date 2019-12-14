package com.capgemini.onlinemedicalstorecollection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.database.AdminUserDB;

public class MedicalStoreDAOImpl implements MedicalStoreDAO {
	public static ArrayList<AdminUserBean> userlist = new AdminUserDB().database();
	AdminUserBean adminBean = null;
	AdminUserDB db = new AdminUserDB();
	ArrayList<AdminUserBean> userArray = new ArrayList<AdminUserBean>();
	Scanner sc = new Scanner(System.in);
	Iterator<AdminUserBean> it = userlist.iterator();
	
	@Override
	public AdminUserBean login(String email, String password) {

		AdminUserBean bean = new AdminUserBean();
		while (it.hasNext()) {
			AdminUserBean user = it.next();
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				bean = user;
				System.out.println("--------Welcome  "+user.getName()+"----------");
			}
		}

		return bean;
	}

	@Override
	public AdminUserBean showUser() {
		AdminUserBean user1= new AdminUserBean();
		System.out.println("");

		while (it.hasNext()) {
			AdminUserBean user = it.next();
			if (user.getType().equals("user")) {
				System.out.println("User Id   :" + user.getId());
				System.out.println("User Name :" + user.getName());
				System.out.println("User Email:" + user.getEmail());
				System.out.println("-------------------------------");
				user1 = user;
			}
		}
		return user1;
	}

	/*
	 * @Override public AdminUserBean registerUser(int id,String name,String email,
	 * String pswd,String type) {
	 * 
	 * AdminUserBean bean = new AdminUserBean(); bean.setId(id); bean.setName(name);
	 * bean.setEmail(email); bean.setPassword(pswd); bean.setType(type);
	 * userlist.add(bean);
	 * 
	 * System.out.println("id "+bean.getEmail());
	 * System.out.println("password "+bean.getPassword());
	 * 
	 * return bean; }
	 */
	
	@Override
	public AdminUserBean resetPassword() {
		AdminUserBean userbean = new AdminUserBean();
		boolean ismedicinePresent = false;
		boolean loop = true;
		while (loop) {
			System.out.print("\nEnter User ID to Modify : ");
			int uID = sc.nextInt();

			while (it.hasNext()) {
				AdminUserBean user2 = it.next();

				if (uID == user2.getId()) {
					ismedicinePresent = true;
					loop = false;
					System.out.println("\nUser ID " + user2.getId());
					System.out.println("Enter Password to change : ");
					sc.nextLine();
					user2.setType(sc.nextLine());
					System.out.println("Changed");				

				}

			}

			if (!ismedicinePresent) {
				System.out.println("User with this ID is not present. Try again.");
			}
		}
		return userbean;
	}

	@Override
	public boolean removeUser(int id) {
		boolean isAvail;

		isAvail = false;

		for (AdminUserBean userBean : userlist) {
			if (id == userBean.getId()) {
				userlist.remove(userBean);
				System.out.println("User Removed......");
				isAvail = true;
				break;

			} else {
				isAvail = false;
			}
		}
		if (!isAvail) {
			System.out.println("User is not present");
		}

		return isAvail;

	}

	@Override
	public Boolean searchAdmin(String email) {
		if (userlist.equals(email)) {
			return true;
		}
		return null;
	}

	@Override
	public AdminUserBean registerUser(int id, String name, String emailId, String password, String type) {
		boolean addUser = false;
		AdminUserBean adminBean = new AdminUserBean();
		for(AdminUserBean bean : userlist) {
			if(bean.getId()==id) {
				addUser = true;
				this.adminBean = null;
				return adminBean;
			}
		}//End of for each
		if(!addUser) {
			adminBean.setId(id);
			adminBean.setName(name);
			adminBean.setEmail(emailId);
			adminBean.setPassword(password);
			adminBean.setType(type);
			userlist.add(adminBean);
			System.out.println();
			System.out.println("*********************************");
			System.out.println("The User Id: " + adminBean.getId());
			System.out.println("The User Name: " + adminBean.getName());
			System.out.println("The User Email Id: " + adminBean.getEmail());
			System.out.println("The Type " + adminBean.getType());
			System.out.println("*********************************");
			System.out.println();
		}//End of if block
		
		return adminBean;
	}

}
