package com.yi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yi.dto.Inter;


@Repository
public interface InterDao {
	
	public List<Inter> selAllInter();//��ѯ���нӿ�
	
	public int addInter(Inter inter);//���ӽӿ�
	
	public int updateInter(Inter inter);//�޸Ľӿ�
	
	public void delInter(int id);//ɾ���ӿ�

	

}
