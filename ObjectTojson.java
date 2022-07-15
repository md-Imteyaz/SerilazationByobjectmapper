package com.JacksonByObjectMapper.model;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectTojson {

	public static void main(String[] args) {
		Product otj = new Product();
		otj.setName("steel");
		otj.setExpirydate("six months from date of packing");
		otj.setManufacturingdate("04-04-2023");
		otj.getName();
		otj.getExpirydate();
		otj.getManufacturingdate();

		ObjectMapper om = new ObjectMapper();
		try {

			// first way

			String writeValueAsString = om.writeValueAsString(otj);
			System.out.println("output--->" + writeValueAsString);

			// second way

			writeValueAsString = om.writerWithDefaultPrettyPrinter().writeValueAsString(otj);
			System.out.println("output--->" + writeValueAsString);

			// 3rd way

			om.writeValue(new File("src/main/resources/Product1.json"), otj);
		} catch (Exception ex) {
			ex.fillInStackTrace();
		}

	}
}
