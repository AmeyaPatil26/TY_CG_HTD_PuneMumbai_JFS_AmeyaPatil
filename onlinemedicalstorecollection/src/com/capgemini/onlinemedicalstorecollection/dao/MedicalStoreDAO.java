package com.capgemini.onlinemedicalstorecollection.dao;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;

public interface MedicalStoreDAO  {

	public AdminUserBean login(String email, String password);
	public AdminUserBean showUser();
	public AdminUserBean registerUser(int id, String name,String email, String pswd,String type);
	public AdminUserBean resetPassword();
	public boolean removeUser(int id);
	
	public Boolean searchAdmin(String email);
}//End of interface
