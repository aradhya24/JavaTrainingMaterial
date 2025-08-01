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

@WebServlet("/movie")
public class MovieRating extends HttpServlet{
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String movieName = req.getParameter("moviename");
    	 
         Map<String, ArrayList<String>> movieMap = new HashMap<>();

         movieMap.put("Inception", new ArrayList<>(Arrays.asList("Rating: 9/10", "Genre: Sci-Fi", "Review: Mind-blowing visuals")));
         movieMap.put("The Godfather", new ArrayList<>(Arrays.asList("Rating: 9.2/10", "Genre: Crime", "Review: Masterpiece of cinema")));
         movieMap.put("Interstellar", new ArrayList<>(Arrays.asList("Rating: 8.6/10", "Genre: Sci-Fi", "Review: Emotionally powerful and scientifically deep")));

         
         PrintWriter pw = resp.getWriter();
         
     	if(movieName.isEmpty() || !movieMap.containsKey(movieName)) {
     		pw.write("Movie name is invalid");
     	}
     	else {
     		pw.write(movieName + " : " + movieMap.get(movieName).toString());
     	}
    	 
    
	}
}
