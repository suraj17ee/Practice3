package com.content;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowLaptop extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletConfig conf=getServletConfig();
	String lap1=conf.getInitParameter("lap1");
	String lap2=conf.getInitParameter("lap2");
	String lap3=conf.getInitParameter("lap3");
	String lap4=conf.getInitParameter("lap4");
	String lap5=conf.getInitParameter("lap5");
	String lap6=conf.getInitParameter("lap6");
	
	PrintWriter out=resp.getWriter();
	out.println("<html><head>"
			+"<style>"
			+".side{"
			+"display: inline-block;"
			+"}"
			+"#titles{"
			+"width:150px;"
			+"height:150px;"
			+"border:1px solid black;"
			+"margin-right:75px;"
			+"}"
			+"</style>"
			+"</head>"
			+"<body>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+lap1
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+lap2
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+lap3
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+lap4
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+lap5
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+lap6
			+	"</div>"
			+"</div>"
			+"</body>"
			+"</html>");

}
}
