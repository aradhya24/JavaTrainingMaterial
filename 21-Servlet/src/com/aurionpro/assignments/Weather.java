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

import com.sun.javafx.collections.MappingChange.Map;

@WebServlet("/weather")
public class Weather extends HttpServlet{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        
        String name = req.getParameter("city");
    	 
        HashMap<String, ArrayList<String>> map = new HashMap<>();
    	
        map.put("Delhi", new ArrayList<>(Arrays.asList("35°C", "45%", "Sunny")));
        map.put("Mumbai", new ArrayList<>(Arrays.asList("30°C", "70%", "Humid")));
        map.put("Chennai", new ArrayList<>(Arrays.asList("33°C", "65%", "Cloudy")));
        map.put("Kolkata", new ArrayList<>(Arrays.asList("31°C", "68%", "Rainy"))); 
    	
        PrintWriter pw = resp.getWriter();
        
    	if(name.isEmpty() || !map.containsKey(name)) {
    		pw.write("City name is invalid");
    	}
    	else {
    		pw.write(name + " : " + map.get(name).toString());
    	}
    	
    }
}
