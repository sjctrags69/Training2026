package org.ssglobal.training.codes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestCreateJSON {
	
	@Test
	public void testCreateJSONFile() {
		CreateJSON json = new CreateJSON();
		json.createJSONFile();
	}
	
	@Test
	public void testReadJSOnFile() {
		CreateJSON json = new CreateJSON();
		Map<String, Object> hashMap = json.readJSONHashMapFile();
		System.out.println(hashMap);
		String data = json.readJSONString();
		System.out.println(data);
	}
	
	
	
	@Test
	public void testCreateJSONArrayFile() {
		CreateJSON json = new CreateJSON();
		json.createJSONArrayFile();
	}
	
	@Test
	public void testReadJSONArrayFile() {
		CreateJSON json = new CreateJSON();
		List<Map<String, Object>> data = json.readJSONArrayFile();
		System.out.println(data);
	
	}

	
	@Test
	public void testCreateJSONObjectFile() {
		CreateJSON json = new CreateJSON();
		json.createJSONObjectFile();
	}
	
	@Test
	public void testCreateJSONObjectArrayFile() {
		CreateJSON json = new CreateJSON();
		json.createJSONObjectArrayFile();
	}
}
