
package com.javafile.Taskjava.prog;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import com.javafile.Taskjava.Person.Person;

public class ApplicationContext {
	
	Map<String, String> fileNames = new HashMap<String, String>();
	{
	
	try {
		
		File XmlFile = new File("C:/Users/vijayj/java Practice/Taskjava/Resource/NewReader.xml");
		DocumentBuilderFactory dbfactory =DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
		Document doc = dBuilder.parse(XmlFile);
		
		doc.getDocumentElement().normalize();
		
		NodeList nName= doc.getElementsByTagName("input-file");
		
		for(int i = 0; i < nName.getLength(); i++){
			Node node = nName.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Person person = new Person();
				Element eElement = (Element) node;
				
				System.out.println("name: " +eElement.getAttribute("name")+" - Time: "+eElement.getAttribute("time"));
				fileNames.put(eElement.getAttribute("name"),eElement.getAttribute("date"));
			}
		}
		
		NodeList Date = doc.getElementsByTagName("date");
		
		for(int i = 0; i < Date.getLength(); i++){
			Node nNode = Date.item(i);
		}
	}
	
	catch (Exception e){
		e.printStackTrace();
	}

	

	}
}
