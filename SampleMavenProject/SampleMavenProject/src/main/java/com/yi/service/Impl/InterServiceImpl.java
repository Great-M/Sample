package com.yi.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yi.dao.InterDao;
import com.yi.dto.Inter;
import com.yi.service.InterService;

@Service("interservice")
public class InterServiceImpl implements InterService {
	
	private InterDao interdao;

	public InterDao getInterdao() {
		return interdao;
	}
	@Resource
	public void setInterdao(InterDao interdao) {
		this.interdao = interdao;
	}

	
	@Override
	public List<Inter> selAllInter() {
		// TODO Auto-generated method stub
		return interdao.selAllInter();
	}

	@Override
	public int addInter(Inter inter) {
		// TODO Auto-generated method stub
		return interdao.addInter(inter);
	}

	@Override
	public int updateInter(Inter inter) {
		// TODO Auto-generated method stub
		return interdao.updateInter(inter);
	}

	@Override
	public void delInter(int id) {
		// TODO Auto-generated method stub
		interdao.delInter(id);
	}

}
