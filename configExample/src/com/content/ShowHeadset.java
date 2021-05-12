package com.content;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHeadset extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletConfig conf=getServletConfig();
	String headset1=conf.getInitParameter("headset1");
	String headset2=conf.getInitParameter("headset2");
	String headset3=conf.getInitParameter("headset3");
	String headset4=conf.getInitParameter("headset4");
	String headset5=conf.getInitParameter("headset5");
	String headset6=conf.getInitParameter("headset6");
	
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
			+		""+headset1
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+headset2
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+headset3
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+headset4
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+headset5
			+	"</div>"
			+"</div>"
			+"<div id='titles' class='side'>"
			+	"<div style='width:145px; height:100px; border:1px solid black;'>"
			+	"</div>"
			+	"<div>"
			+		""+headset6
			+	"</div>"
			+"</div>"
			+"</body>"
			+"</html>");

}
}
