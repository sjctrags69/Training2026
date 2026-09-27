package org.ssglobal.training.codes;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import files.Profile;
import tools.jackson.dataformat.xml.XmlMapper;

public class CreateXML {
	public void createXMLFile() {
		Map<String, Object> data = new HashMap<>();
		data.put("id", 101);
		data.put("firstname", "Juan");
		data.put("lastname", "Luna");
		data.put("salary", 80000.00);
		XmlMapper xmlMapper = new XmlMapper();
		
		Profile p = new Profile(201, "Jose", "Rizal", 90000.55);
		//String res = xmlMapper.writeValueAsString(p);
		xmlMapper.writeValue(new File("./src/files/profile.xml"), p);
		
		String datastr  = xmlMapper.writer().writeValueAsString(data);
		System.out.println(datastr);
		//System.out.println(res);
		
		Profile res  = 
				xmlMapper.readValue(new File("./src/files/profile.xml"), Profile.class);
		System.out.println(res.getSalary());
	}
}
