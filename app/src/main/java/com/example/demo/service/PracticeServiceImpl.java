package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class PracticeServiceImpl implements PracticeService {

	@Override
	public List<String> getAll() {
		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("2");
		list.add("3");
		
		return list;
	}

}
