package com.simple.command;

import java.util.ArrayList;

public class ReqVO {
	
	//VO는 table 당 한개
	//만드는 규칙 - VO와 동일하게 만듬
	//폼값의 동일한 name과 동일한 변수를 멤버변수로 선언
	
	private String name;
	private String age;
	private ArrayList<String> inter; //check박스

	
	public ReqVO() {
		// TODO Auto-generated constructor stub
	}

	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
	}
	
	
	

	//값에 대한 확인을 빠르게 하기 위해
	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}

	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}
	
	
}
