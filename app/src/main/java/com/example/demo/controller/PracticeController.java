package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PracticeService;
import com.example.demo.service.PracticeServiceImpl;

@RestController
@RequestMapping("api/practice")
public class PracticeController {
	private final PracticeService practiceService;

	@Autowired
	public PracticeController(PracticeServiceImpl practiceService) {
		this.practiceService = practiceService;
	}

	@GetMapping
	public List<String> getAll() {
		List<String> list = practiceService.getAll();

		return list;
	}
}
