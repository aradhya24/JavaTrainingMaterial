package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductStockChecker extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int productId = Integer.parseInt(req.getParameter("product_id"));
		
		
		Map<Integer, Product> map = new HashMap<>();

		map.put(1, new Product(1, "Pen", 15));
		map.put(2, new Product(2, "Eraser", 15));
		map.put(3, new Product(3, "Sharpner", 0));
		map.put(4, new Product(4, "Slate", 15));

		PrintWriter pw = resp.getWriter();

		if (productId == 0 || !map.containsKey(productId)) {
			pw.write("Product  is invalid");
		} else {
			pw.write(productId + " : " + map.get(productId));
			
		}
	}
}

class Product {
	int productId;
	String productName;
	boolean availability;
	int stockCount;

	public Product(int productId, String productName, int stockCount) {
		this.productId = productId;
		this.productName = productName;

		if (stockCount < 1) {
			this.availability = false;
		} else {
			this.availability = true;
		}

		this.stockCount = stockCount;
	}
    
	
	@Override
	public String toString() {
		return "Product ID: " + productId + ", Name: " + productName + ", Stock: " + stockCount + ", Available: " + availability;
	}
}