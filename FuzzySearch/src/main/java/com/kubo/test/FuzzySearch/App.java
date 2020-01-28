package com.kubo.test.FuzzySearch;

import java.util.List;

import com.google.gson.Gson;
import com.kubo.test.FuzzySearch.services.UserOperation;

/**
 * Hello world!
 *
 */

public class App {

	public static void main(String[] args) {
		UserOperation userOperation = new UserOperation();
		switch ((args[1])) {
		case "add":
			System.out.println(userOperation.add(args[2]));
			break;
		case "list":
			List<Object> list = userOperation.list();
			String json = new Gson().toJson(list);
			System.out.println(json);
			break;
		case "fuzzy-search":
			String search = userOperation.search(args[2]);
			System.out.println(search);
			break;
		}
	}
}
