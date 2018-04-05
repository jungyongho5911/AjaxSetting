package com.project.web.person;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:META-INF/*-context.xml"
})
@WebAppConfiguration
public class PersonControllerTest {
	@Autowired PersonService service;
	@Test
	public void testHome() {
		String result="존재 하지 않습니다";
		Map<String,String> map = new HashMap<>();
		
		map.put("type", "member");
		map.put("id", "userid");
		map.put("pass", "password");
		map.put("data1", "skyfor1004");
		map.put("data2", "1");

		if(service.exist(map)==1){
			result="존재합니다";
		}
		assertEquals("존재합니다", result);
	}

}
