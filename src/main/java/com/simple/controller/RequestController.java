package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;
import com.simple.command.loginVO;

@Controller
@RequestMapping("/request") // 각 메서드의 공통분모
public class RequestController {

	//@RequestMapping("/req_ex01")
	//@RequestMapping("/xxx/aaa") 들어오는 경로와 나가는경로 완전 다름
	
	
	//화며을 띄우는
	@RequestMapping("/req_ex01") //request/req_ex01
	public String ex01() {
		
		return "request/req_ex01";
	}
	
	//get요청만 허용
	//@RequestMapping(value= "/basic1", method = RequestMethod.GET)
	@GetMapping("/basic1")
	public void basic1() {
		System.out.println(" basic요청 ");
	}
	
	//post요청만 허용
	//@RequestMapping(value= "/basic2", method = RequestMethod.POST)
	@PostMapping("/basic2")
	public void basic2() {
		
		System.out.println(" basic2요청");
	}
	
	//get, post 둘다 허용
	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println(" basic3요청 ");
	}
	
	///////////////////////////////////////
	
	@RequestMapping("/req_ex02")
	public String ex02() {
		return "request/req_ex02";
	}
	
	//전통방식
	/*
	 * @RequestMapping("/param1") public String param1(HttpServletRequest request) {
	 * 
	 * String name = request.getParameter("name"); String age =
	 * request.getParameter("age"); String[] inter =
	 * request.getParameterValues("inter");
	 * 
	 * System.out.println(name); return "request/result"; //result페이지로 }
	 */
	
	//@RequestParam(네임값) - 반드시 필수로 값이 전달되어야한다.
	//required = false는 반드시 필수가 아님
	//defaultValue 값이 없을때 기본값 
	/*
	 * @RequestMapping("/param1") public String param1 (@RequestParam("name") String
	 * x,
	 * 
	 * @RequestParam(value = "age", required = false, defaultValue = "0") int y,
	 * 
	 * @RequestParam(value = "inter", required = false, defaultValue ="")
	 * ArrayList<String> z) {
	 * 
	 * System.out.println(x); System.out.println(y);
	 * System.out.println(z.toString());
	 * 
	 * return "request/result"; //result페이지로 }
	 */
	
	 // 세가지 중 많이 쓰이는 방법
	 // 커맨드객체 이용하는 방법
	 @RequestMapping("/param1") 
	 public String param1 (ReqVO vo) {
		 
		 System.out.println(vo.toString());

	 return "request/result"; //result페이지로 
	 }
	 
	 //퀴즈 화면처리
	 @RequestMapping("/req_quiz01") 
		 public String quiz01() {
		 return "request/req_quiz01";
	 }
	 
	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	 public String login(@RequestParam("id") String id,
			 			 @RequestParam("pw") String pw ) {
		 if(id.equals("abc123")&&pw.equals("xxx123")) {
				return "request/req_quiz01_ok";
			} else {
				return "request/req_quiz01_no";
			}
	 }
	 
//	 public String login (loginVO vo) {
//		
//		String id = vo.getId();
//		String pw = vo.getPw();
//		if(id.equals("abc123")&&pw.equals("xxx123")) {
//			return "request/req_quiz01_ok";
//		} else {
//			return "request/req_quiz01_no";
//		}
//	 }
	 
	 
}
