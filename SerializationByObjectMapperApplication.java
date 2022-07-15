package com.JacksonByObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.JacksonByObjectMapper.model.Product;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//json to Object
@SpringBootApplication
public class SerializationByObjectMapperApplication {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(SerializationByObjectMapperApplication.class, args);

		System.out.println("serilizing json object by object mapper");

		ObjectMapper mapper = new ObjectMapper();

		// this is object serilazation of json object
		Product product = mapper.readValue(new File("src/main/resources/Product.json"), Product.class);
		System.out.println("serilized json object>>>" + product);

		// this is object serilazation of json object list

		List<Product> productlist = mapper.readValue(new File("src/main/resources/ProductList.json"),
				new TypeReference<List<Product>>() {
				});
		System.out.println("serilized json object productlist>>>" + productlist);

		// this is object serilazation of json object Array

		Product[] productlist1 = mapper.readValue(new File("src/main/resources/ProductList.json"), Product[].class);

		System.out.println("serilized json object product[]>>>" + productlist1);
		for (Product pr : productlist1) {
			System.out.println(pr);
		}

	}

}
