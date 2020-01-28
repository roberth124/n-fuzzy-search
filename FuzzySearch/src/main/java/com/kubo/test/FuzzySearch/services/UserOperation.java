package com.kubo.test.FuzzySearch.services;

import java.util.ArrayList;
import java.util.List;
import com.kubo.test.FuzzySearch.repository.UsersPersist;
import com.kubo.test.FuzzySearch.utils.Utils;

public class UserOperation {

	private UsersPersist usersPersist;
	private Utils utils;;

	public UserOperation() {
		this.usersPersist = new UsersPersist();
		this.utils = new Utils();
	}

	public String add(String usuario) {
		return this.usersPersist.save(usuario);
	}

	public List<Object> list() {
		return this.usersPersist.getUsers();
	}

	public String search(String pattern) {
		List<String> coincidences = new ArrayList<>();
		pattern = this.utils.getValue("search", pattern);
		pattern = this.utils.removeSpecialChars(pattern);
		List<String> combinations = getCombinations(pattern);
		for (Object value : list()) {
			for (String combination : combinations) {
				if (this.utils.getValue("name", value.toString().toLowerCase()).contains(combination)) {
					coincidences.add(value.toString());
				}
			}
		}

		return coincidences.isEmpty() ? "Sin coincidencias" : coincidences.toString();

	}

	private List<String> getCombinations(String pattern) {
		List<String> combinations = new ArrayList<>();
		for (int x = 0; x < pattern.length() - 2; x++) {
			combinations.add(pattern.substring(x, x + 3));
		}
		return combinations;
	}

}
