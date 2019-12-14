package com.capgemini.onlinemedicalstorecollection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.onlinemedicalstorecollection.beans.ProductBean;
import com.capgemini.onlinemedicalstorecollection.database.ProductDB;

public class ProductDAOImpl implements ProductDAO {

	public static ArrayList<ProductBean> productArray = new ProductDB().productData();
	Iterator<ProductBean> productIterate = productArray.iterator();
	ProductBean bean = new ProductBean();
	Scanner sc = new Scanner(System.in);

	@Override
	public ProductBean showProduct() {
		ProductBean productBean = new ProductBean();
		System.out.println("------------Medicines---------");
		while (productIterate.hasNext()) {
			ProductBean med = productIterate.next();
			System.out.println("Medicine Id :       " + med.getProductId());
			System.out.println("Medicine Name :     " + med.getProductName());
			System.out.println("Medicine Price :    " + med.getPrice());
			System.out.println("Medicine Category : " + med.getCategory());
			System.out.println("Availability  :"+med.getAvailability());
			System.out.println("------------------------------------");
			productBean = med;
		}
		return productBean;
	}

	@Override
	public ProductBean addProdcut(int id,String name, int price,String avai) {
		boolean isPresent;
		do {
			isPresent = false;
			while (productIterate.hasNext()) {
				ProductBean pBean = productIterate.next();
				if (id == bean.getProductId()) {
					System.out.println("Medicine is Present ...");
					isPresent = true;
				}
			}
		
			if (!isPresent) {
				bean.setProductId(id);
				bean.setProductName(name);
				bean.setPrice(price);
				bean.setCategory(avai);

				productArray.add(bean);
				System.out.println("Medicine Added Successfully");
			}
		} while (isPresent);

		return null;
	}

	@Override
	public boolean removeProdcut() {
		boolean isPresent;

		isPresent = false;
		System.out.println("Enter Medicine Id :");
		int id = Integer.parseInt(sc.nextLine());

		for (ProductBean medicineBean : productArray) {
			if (id == medicineBean.getProductId()) {

				productArray.remove(medicineBean);
				System.out.println("Removed");
				isPresent = true;
				break;

			} else {
				isPresent = false;
			}

		}
		if (!isPresent) {
			System.out.println("Medicine is not present");
		}

		return isPresent;
	}

	@Override
	public ProductBean updateProduct(int mdID) {
		boolean isPresent = false;
		boolean update = true;
		while (update) {
	
			while (productIterate.hasNext()) {
				ProductBean med = productIterate.next();

				if (mdID == med.getProductId()) {
					isPresent = true;
					update = false;

					System.out.println("\nChange the Information for Medicine ID " + med.getProductId());

					System.out.print("\nMedicine Price : ");
					sc.nextLine();
					med.setPrice(Integer.parseInt(sc.nextLine()));
					System.out.println("Product Updated....");
				}

			}

			if (!isPresent) {
				System.out.println("Medicine with this ID is not present. Try again.");
				
			}
		}
		return bean;
	}

}// End of class
