package com.kubo.test.FuzzySearch.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class UsersPersist {
	private String pathFile = System.getProperty("user.dir")+"\\fuzzy-search.txt";

	public String save(String usuario) {
		Path path = Paths.get(pathFile);
		try (BufferedWriter br = Files.newBufferedWriter(path, Charset.defaultCharset(), StandardOpenOption.APPEND)) {
			br.write(usuario + "\n");
			br.newLine();
			return "Usuario agregado";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	public List<Object> getUsers() {
		Path path = Paths.get(pathFile);
		try {
			return Files.lines(path).sorted().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
