package org.ssglobal.training.codes;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import files.Profile;
import tools.jackson.core.StreamWriteFeature;
import tools.jackson.core.json.JsonReadFeature;
import tools.jackson.core.json.JsonWriteFeature;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.cfg.DateTimeFeature;
import tools.jackson.databind.json.JsonMapper;

public class CreateJSON {
	
	public boolean createJSONFile() {
		Map<String, Object> data = new HashMap<>();
		data.put("id", 101);
		data.put("firstname", "Juan");
		data.put("lastname", "Luna");
		data.put("salary", 80000.00);
		JsonMapper objectMapper = JsonMapper.builder()
		        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
		        .configure(StreamWriteFeature.WRITE_BIGDECIMAL_AS_PLAIN, true)
		        .configure(DateTimeFeature.WRITE_DATES_AS_TIMESTAMPS, false)
		        .configure(JsonWriteFeature.WRITE_NUMBERS_AS_STRINGS, false)
		        .enable(SerializationFeature.INDENT_OUTPUT)
		        .changeDefaultPropertyInclusion(
		        		inclusion -> inclusion.withValueInclusion(Include.NON_NULL))
		        .build();
		
		objectMapper.writeValue(new File("./src/files/profile.json"),data);
		return false;
	}
	
	public Map<String, Object> readJSONHashMapFile() {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> data = objectMapper.readValue(new File("./src/files/profile.json"), HashMap.class );
		return data;
	}
	
	public String readJSONString() {
		ObjectMapper objectMapper = new ObjectMapper();
		String data = objectMapper.readValue(new File("./src/files/profile.json"), String.class );
		return data;
	}
	
	public boolean createJSONArrayFile() {
		Map<String, Object> data1 = new HashMap<>();
		data1.put("id", 101);
		data1.put("firstname", "Juan");
		data1.put("lastname", "Luna");
		data1.put("salary", 80000.00);
		
		Map<String, Object> data2 = new HashMap<>();
		data2.put("id", 101);
		data2.put("firstname", "Juan");
		data2.put("lastname", "Luna");
		data2.put("salary", 80000.00);
		
		List<Map<String, Object>> records = new ArrayList<>();
		records.add(data1);
		records.add(data2);
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("./src/files/profiles.json"), records);
		return false;
	}
	
	public List<Map<String, Object>> readJSONArrayFile() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Map<String, Object>> records = objectMapper.readValue(new File("./src/files/profiles.json"), 
				new TypeReference<List<Map<String, Object>>>() {});
		return records;
	}
	
	public boolean createJSONObjectFile() {
		Profile p = new Profile(201, "Jose", "Rizal", 90000.55);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("./src/files/profile2.json"), p);
		return false;
	}
	
	
	
	public boolean createJSONObjectArrayFile() {
		Profile p1 = new Profile(201, "Jose", "Rizal", 90000.55);
		Profile p2 = new Profile(203, "Juan", "Luna", 30000.55);
		List<Profile> records = new ArrayList<>();
		records.add(p1);
		records.add(p2);
		ObjectMapper objectMapper = new ObjectMapper();
		
		objectMapper.writeValue(new File("./src/files/profiles2.json"), records);
		return false;
	}
	
	

}
