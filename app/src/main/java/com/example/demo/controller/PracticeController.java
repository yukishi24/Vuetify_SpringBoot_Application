package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DataDTO;
import com.example.demo.repository.DataRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class PracticeController {
	private final DataRepository dataRepository;

	@GetMapping("/home")
	public List<DataDTO> getData(Model model) {
		List<DataDTO> DTOList = dataRepository.getAll();
		return DTOList;
	}
}
