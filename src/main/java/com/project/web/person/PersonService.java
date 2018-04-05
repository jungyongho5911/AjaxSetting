package com.project.web.person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.web.common.CRUDService;
import com.project.web.mapper.Mapper;

@Service
public class PersonService {
	@Autowired Mapper mapper;
	public int exist(Map<?,?>param){
		int count = 0;
		CRUDService.Count exist =  (x) -> mapper.exist(x);
		switch (param.get("type").toString()) {
		case "member":
			count = exist.ececute(param); 
			break;

		default:
			break;
		}
		System.out.println("회원 ID 존재여부 체크" + count);
		return count;  
	}
}
