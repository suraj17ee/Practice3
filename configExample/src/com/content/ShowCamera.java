package com.content;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowCamera extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		ServletConfig conf=getServletConfig();
		String cam1=conf.getInitParameter("cam1");
		String cam2=conf.getInitParameter("cam2");
		String cam3=conf.getInitParameter("cam3");
		String cam4=conf.getInitParameter("cam4");
		String cam5=conf.getInitParameter("cam5");
		String cam6=conf.getInitParameter("cam6");
		
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
				+		""+cam1
				+	"</div>"
				+"</div>"
				+"<div id='titles' class='side'>"
				+	"<div style='width:145px; height:100px; border:1px solid black;'>"
				+	"</div>"
				+	"<div>"
				+		""+cam2
				+	"</div>"
				+"</div>"
				+"<div id='titles' class='side'>"
				+	"<div style='width:145px; height:100px; border:1px solid black;'>"
				+	"</div>"
				+	"<div>"
				+		""+cam3
				+	"</div>"
				+"</div>"
				+"<div id='titles' class='side'>"
				+	"<div style='width:145px; height:100px; border:1px solid black;'>"
				+	"</div>"
				+	"<div>"
				+		""+cam4
				+	"</div>"
				+"</div>"
				+"<div id='titles' class='side'>"
				+	"<div style='width:145px; height:100px; border:1px solid black;'>"
				+	"</div>"
				+	"<div>"
				+		""+cam5
				+	"</div>"
				+"</div>"
				+"<div id='titles' class='side'>"
				+	"<div style='width:145px; height:100px; border:1px solid black;'>"
				+	"</div>"
				+	"<div>"
				+		""+cam6
				+	"</div>"
				+"</div>"
				+"</body>"
				+"</html>");
	
	}
}
