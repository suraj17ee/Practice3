package com.content;
import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ShowMobile extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	ServletConfig conf=getServletConfig();
	String mob1=conf.getInitParameter("mob1");
	String mob2=conf.getInitParameter("mob2");
	String mob3=conf.getInitParameter("mob3");
	String mob4=conf.getInitParameter("mob4");
	String mob5=conf.getInitParameter("mob5");
	String mob6=conf.getInitParameter("mob6");
	
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
			+		""+mob1
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+mob2
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+mob3
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+mob4
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+mob5
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+mob6
			+	"</div>"
			+"</div>"
			+"</body>"
			+"</html>");
}
}
