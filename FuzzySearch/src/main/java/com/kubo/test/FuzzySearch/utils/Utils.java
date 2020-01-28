package com.kubo.test.FuzzySearch.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Utils {

	public String removeSpecialChars(String pattern) {
		  return  pattern.toString().replaceAll("[^A-Za-z0-9 ]+", "");
	}

	public String getValue(String field, String pattern) {
		JsonObject jsonObject = new Gson().fromJson(pattern, JsonObject.class);
		return jsonObject.get(field).getAsString();
	}
	


}
