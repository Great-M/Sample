package com.yi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yi.dto.Inter;


public interface InterService {
	
	public List<Inter> selAllInter();//��ѯ���нӿ�
	
	public int addInter(Inter inter);//���ӽӿ�
	
	public int updateInter(Inter inter);//�޸Ľӿ�
	
	public void delInter(int id);//ɾ���ӿ�

}
