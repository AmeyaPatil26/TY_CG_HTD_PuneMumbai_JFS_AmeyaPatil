package com.capgemini.onlinemedicalstorecollection.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.beans.AdminUserBean;
import com.capgemini.onlinemedicalstorecollection.beans.CartBean;
import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;
import com.capgemini.onlinemedicalstorecollection.database.AdminUserDB;
import com.capgemini.onlinemedicalstorecollection.database.CartDB;
import com.capgemini.onlinemedicalstorecollection.database.ProductDB;

public class UserCartDAOImpl implements UserCartDAO {

	public static ArrayList<CartBean> cartList = new CartDB().cartDB();
	public static ArrayList<AdminUserBean> userList = new AdminUserDB().database();
	public static ArrayList<ProductBean> medList = new ProductDB().productData();
	Iterator<CartBean> iterateCart = cartList.iterator();
	Iterator<AdminUserBean> iterateUser = userList.iterator();
	Iterator<ProductBean> iterateMed = medList.iterator();
	CartBean cbean = new CartBean();
	Scanner sc = new Scanner(System.in);
	int price = 0;

	@Override
	public CartBean addCart(ProductBean productBean, AdminUserBean adminUserBean) {
		boolean isAvail;
		do {
			isAvail = false;
			int id = cartList.size() + 100;
			while (iterateCart.hasNext()) {
				CartBean cartBean = iterateCart.next();
				isAvail = true;
			}
			System.out.println("No of medicine u want");
			int n = Integer.parseInt(sc.nextLine());
			for(int i = 1; i<=n ;i++) {
			if (!isAvail) {
				cbean.setCartId(id);
				cbean.setUserId(adminUserBean.getId());
				System.out.println("Enter Medicine Id to Add :");
				int mid = Integer.parseInt(sc.nextLine());
				if (mid == productBean.getProductId()) {
					cbean.setProductId(mid);
					cbean.setPrice(productBean.getPrice());
				}
				cartList.add(cbean);
				System.out.println("Added to Cart");

			}}
			
		} while (isAvail);

		return cbean;
	}

	@Override
	public CartBean getCart() {
		System.out.println("---Cart---");
		CartBean cbean = new CartBean();
		
		while (iterateCart.hasNext() && iterateUser.hasNext() &&  iterateMed.hasNext()) {
			CartBean cBean2 = iterateCart.next();
			ProductBean pBean = iterateMed.next();
			AdminUserBean uBean = iterateUser.next();
			int userid = uBean.getId();
			int productid = pBean.getProductId();
			int price = pBean.getPrice();
			System.out.println("Cart id :" + cBean2.getCartId());
			System.out.println("User id : " + uBean.getId());
			System.out.println("Medicine id : " +pBean.getProductId());
			System.out.println("Price : " + price);
			System.out.println("-----------------------------");
			cBean2 = cbean;
		}

		return cbean;
	}

	@Override
	public void getBill() {
		
		int total =0;
		for(CartBean cartBean:cartList) {
		
			ProductBean product= iterateMed.next();
			int price=product.getPrice();
			//System.out.println(product.getPrice());
			total = total+price;
		}
			System.out.println("Bill : " + total);
			System.out.println("-----------------------------");
	
	}

}
