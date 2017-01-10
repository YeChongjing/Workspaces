package study.ch14;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
@WebServlet("/DispUsersServlert")
public class DispUsersServlert extends HttpServlet {
	private static final long serialVersionUID  = 1L;
	public DispUsersServlert(){
		super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			XMLSASTools handler = new XMLSASTools(response.getWriter());
			parser.parse("file:///"+request.getServletContext().getRealPath("/")+"MyXml.xml",handler);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
