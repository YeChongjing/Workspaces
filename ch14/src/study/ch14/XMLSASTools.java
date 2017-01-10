package study.ch14;
import java.io.PrintWriter;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;



public class XMLSASTools extends DefaultHandler{
	private PrintWriter out;
	public XMLSASTools(PrintWriter out){
		this.out = out;
	}
	@Override
	public void startElement(String uri,String localName,String qName,Attributes attributes){
		try {
			super.startElement(uri, localName, qName, attributes);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.write(qName+":");
		for(int i=0;i<attributes.getLength();i++){
			out.write(attributes.getQName(i)+":"+attributes.getValue(i)+"<br/>");
		}
	}
	@Override
	public void characters(char[] ch,int start,int length) throws SAXException{
		super.characters(ch, start, length);
		out.write(new String (ch,start,length)+"<br/>");
	}
}
