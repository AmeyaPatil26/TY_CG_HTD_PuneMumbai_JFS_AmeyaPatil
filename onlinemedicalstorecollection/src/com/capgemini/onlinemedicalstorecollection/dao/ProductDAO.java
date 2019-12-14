package com.capgemini.onlinemedicalstorecollection.dao;

import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;

public interface ProductDAO {

	public ProductBean showProduct();
	public ProductBean addProdcut(int id,String name, int price,String avai);
	public boolean removeProdcut();
	public ProductBean updateProduct(int mdID);
}
