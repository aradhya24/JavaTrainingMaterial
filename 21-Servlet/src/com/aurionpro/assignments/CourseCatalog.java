package com.aurionpro.assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/course")
public class CourseCatalog extends HttpServlet{
	
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
         String dept = req.getParameter("dept");
    	 
         HashMap<String, ArrayList<String>> map = new HashMap<>();
     	
         map.put("CS", new ArrayList<>(Arrays.asList("JAVA", "PYTHON", "DATABASE")));
         map.put("IT", new ArrayList<>(Arrays.asList("NETWORKING", "SERVER", "CLOUD")));
         map.put("AIML", new ArrayList<>(Arrays.asList("ML", "AI", "DL")));
         
         PrintWriter pw = resp.getWriter();
         
     	if(dept.isEmpty() || !map.containsKey(dept)) {
     		pw.write("Department name is invalid");
     	}
     	else {
     		pw.write(dept + " : " + map.get(dept).toString());
     	}
    	 
    }

}
