package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DataDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class DataRepository {
	private final JdbcTemplate jdbcTemplate;

	public List<DataDTO> getAll() {
		//SELECT Query
		String sql = "SELECT id, code, name, belong_nm FROM person";

		List<Map<String, Object>> dataList = jdbcTemplate.queryForList(sql);
		//結果を返すリスト
		List<DataDTO> ResultList = new ArrayList<>();
		for (Map<String, Object> data : dataList) {
			
			ResultList.add(new DataDTO((int) data.get("id"), (String) data.get("code"), (String) data.get("name"),
					(String) data.get("belong_nm")));
		}
		return ResultList;
	}
}
