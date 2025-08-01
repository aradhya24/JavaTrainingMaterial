package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submitReview")
public class ProductFeedbackSubmission extends HttpServlet{
       
	static List<ProductFeed> list = new ArrayList<>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int productId = Integer.parseInt(req.getParameter("productId"));
		int rating = Integer.parseInt(req.getParameter("rating"));
		String review = req.getParameter("review");
		
		PrintWriter pw = resp.getWriter();
		if(rating < 1 || rating > 5) {
			pw.write("Out of range : Rating should be b/w 1 to 5.....\n\n");
		}
		else if(review.isEmpty()) {
			pw.write("Null : Review not should be empty..\n\n");
		}
		else {
			list.add(new ProductFeed(productId, rating, review));
			pw.write("Thank you for submitting review : " + productId + " | " + rating + "\n\n");
		}
		
		for(ProductFeed p : list) {
			pw.write("\nProduct Id : " + p.productId + " | " + "Rating : " + p.rating + " | " + "Review : " + p.review);
		}
	}
}


class ProductFeed{
	int productId;
	int rating;
	String review;
	
	public ProductFeed(int productId, int rating, String review) {
		this.productId = productId;
		this.rating = rating;
		this.review = review;
	}

	@Override
	public String toString() {
		return "product [productId=" + productId + ", rating=" + rating + ", review=" + review + "]\n";
	}
	
	
}