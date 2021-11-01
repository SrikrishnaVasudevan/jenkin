package com.fiserv.drugs.dao;

import java.util.List;

import com.fiserv.drugs.entity.Product;
import com.fiserv.drugs.entity.Users;

public interface DaoInterface {

	String AddProduct(Product pro);

	String deleteById(int id);

	List<Product> getAllProducts();

	Product getProductById(int id);

	String UpdateProduct(Product pro);

	String deleteByUserName(String username);

	List<Users> getAllUsers();

	Users getUserByUserName(String username);

	String AddUser(Users user);

	String UpdateUser(Users user);

}
