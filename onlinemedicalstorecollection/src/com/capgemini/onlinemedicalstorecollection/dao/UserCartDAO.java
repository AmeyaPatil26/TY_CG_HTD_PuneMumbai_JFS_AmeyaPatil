package com.capgemini.onlinemedicalstorecollection.dao;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.beans.CartBean;
import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;

public interface UserCartDAO {


	public CartBean addCart(ProductBean mb , AdminUserBean ub);
	public CartBean getCart();
	public void getBill();
	
}//End of interface
