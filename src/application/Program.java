package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "books");
		seller seller2 = new seller(21, "bob","bob@", new Date(), 3000.0, obj);
		System.out.println(seller2);
		System.out.println(obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();
	}

}
