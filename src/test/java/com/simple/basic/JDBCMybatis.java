package com.simple.basic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;
import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

@RunWith(SpringJUnit4ClassRunner.class) //Junit 테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를 진행할 스프링 설정파일

public class JDBCMybatis {

	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void testCode01() {
//		
//		int result = testMapper.insertOne("test");
//		
//		System.out.println("성공실패?:" + result);
//	}
	
//	@Test
//	public void testCode02() {
//		ScoreVO vo = new ScoreVO(0, "tset", "100", "20");
//		testMapper.insertTwo(vo);
//		
//	}
	
//	@Test
//	public void testCode03() {
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("name", "맵을 통한");
//		map.put("kor", "100");
//		map.put("eng", "100");
//		
//		testMapper.insertThree(map);
//	
//	}
//	
//	@Test
//	public void testCode04() {
//		testMapper.insertFour("test", "60", "80");
//	}
	
	
//	@Test
//	public void testCode05() {
//
//		testMapper.updateOwn(new ScoreVO(2, "admin", "100", "100"));
//		
//	}
	
//	@Test
//	public void testCode06() {
//
//		ScoreVO vo = testMapper.selectOne(2);
//		System.out.println(vo.toString());
//	}
	
//	@Test
//	public void testCode07() {
//		HashMap<String, Object> map = testMapper.selectTwo(2);
//		System.out.println(map.toString());
//	}

//	@Test
//	public void testCode08() {
//		ArrayList<HashMap<String, Object>> list = testMapper.selectThree();
//		System.out.println(list.toString());
//	}

//	@Test
//	public void testCode09() {
//		ArrayList<ScoreVO> list = testMapper.joinOne();
//		System.out.println(list.toString());
//	}
	
	@Test
	public void testCode10() {
		MemberVO vo = testMapper.joinTwo("test");
		System.out.println(vo.toString());
	}	
	
	@Test
	public void testCode11() {
		
	}

	
}
