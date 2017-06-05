package com.yi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yi.dto.Inter;


public interface InterService {
	
	public List<Inter> selAllInter();//查询所有接口
	
	public int addInter(Inter inter);//增加接口
	
	public int updateInter(Inter inter);//修改接口
	
	public void delInter(int id);//删除接口

}
