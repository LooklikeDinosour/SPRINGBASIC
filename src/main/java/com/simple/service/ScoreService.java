package com.simple.service;

import java.util.ArrayList;

import com.simple.command.ScoreVO;

//인터페이스 @Service붙이면 안됌.
public interface ScoreService {
	
	public void scoreRegist(ScoreVO vo); 
	public ArrayList<ScoreVO> getScores();
	public void scoreDelete(int index);
	
}
