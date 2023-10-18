package com.practice;

import java.util.Arrays;
import java.util.List;

import javax.lang.model.type.ArrayType;

public class Dummy {

	public static void main(String[] args) {

		String name = "I wish you a happy new year";

		String[] items = name.split(" ");

		List<String> list = Arrays.asList(items);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).length() > 3) {

				System.out.println(list.get(i));
			}

		}

	}

}
