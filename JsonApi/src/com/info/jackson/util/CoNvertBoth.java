package com.info.jackson.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class CoNvertBoth {

	private static ObjectMapper mapper;
	private static String result;
	
	static {
		mapper=new ObjectMapper();
	}
	
	public static  String ConvertJson(Object obj) {
	try {
		result = mapper.writeValueAsString(obj);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	return result;
	}
	public static <T> T convertJavaObject(String jsonString,Class<T> obj){
		T readValue = null;
		try {
			 readValue = mapper.readValue(jsonString, obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readValue;
	}
		
	}

