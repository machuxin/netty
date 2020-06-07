package com.machuxin.io.bio.tomcat.servlet;


import com.machuxin.io.bio.tomcat.http.DMRequest;
import com.machuxin.io.bio.tomcat.http.DMResponse;
import com.machuxin.io.bio.tomcat.http.DMServlet;

public class FirstServlet extends DMServlet {

	public void doGet(DMRequest request, DMResponse response) throws Exception {
		this.doPost(request, response);
	}

	public void doPost(DMRequest request, DMResponse response) throws Exception {
		response.write("This is First Serlvet");
	}

}
