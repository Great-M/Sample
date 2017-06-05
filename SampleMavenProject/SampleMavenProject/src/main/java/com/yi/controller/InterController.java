package com.yi.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.objenesis.instantiator.gcj.GCJSerializationInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.yi.dto.Inter;
import com.yi.service.InterService;

@Controller
public class InterController {
	
	private InterService interservice;

	public InterService getInterservice() {
		return interservice;
	}
	@Resource
	public void setInterservice(InterService interservice) {
		this.interservice = interservice;
	}
	
	@RequestMapping("selAllInter")
	@ResponseBody
	public String selAllInter(HttpServletRequest request){
		
		List<Inter> list=new ArrayList<Inter>();
		
		list=interservice.selAllInter();
		
		Gson gson=new Gson();
		
		String json= gson.toJson(list);
		
		return json;
	}
	
	
	@RequestMapping("addInter")
	@ResponseBody
	public String addInter(HttpServletRequest request,HttpSession session){
		
		String pro_name=request.getParameter("pro_name");
		System.out.println(pro_name);
		String inter_name=request.getParameter("inter_name");
		System.out.println(inter_name);
		String inter_author=request.getParameter("inter_author");
		System.out.println("inter_author");
		String inter_features=request.getParameter("inter_features");
		System.out.println(inter_features);
		String inter_path=request.getParameter("inter_path");
		System.out.println("inter_path");
		String inter_coding= request.getParameter("inter_coding");
		System.out.println(inter_coding);
		String inter_param=request.getParameter("inter_param");
		System.out.println(inter_param);
		String out_param=request.getParameter("out_param");
		System.out.println(out_param);
		//取值
		Inter inter=new Inter();
		inter.setPro_name(pro_name);
		inter.setInter_name(inter_name);
		inter.setInter_author(inter_author);
		inter.setInter_features(inter_features);
		inter.setInter_path(inter_path);
		inter.setInter_coding(inter_coding);
		inter.setInter_param(inter_param);
		inter.setOut_param(out_param);
		System.out.println(inter);
		
		int a=interservice.addInter(inter);
		System.out.println(a);
		
		Gson gson=new Gson();
		String json=gson.toJson(a);
		
		return json;
		
	}
	
	@RequestMapping("updateInter")
	@ResponseBody
	public String updateInter(HttpServletRequest request,HttpServletResponse response){
		
		String pro_name=request.getParameter("pro_name");
		System.out.println(pro_name);
		int inter_id=Integer.parseInt(request.getParameter("inter_id"));
		System.out.println(inter_id);
		String inter_name=request.getParameter("inter_name");
		System.out.println(inter_name);
		String inter_author=request.getParameter("inter_author");
		System.out.println("inter_author");
		String inter_features=request.getParameter("inter_features");
		System.out.println(inter_features);
		String inter_path=request.getParameter("inter_path");
		System.out.println("inter_path");
		String inter_coding= request.getParameter("inter_coding");
		System.out.println(inter_coding);
		String inter_param=request.getParameter("inter_param");
		System.out.println(inter_param);
		String out_param=request.getParameter("out_param");
		System.out.println(out_param);
		//取值
		Inter inter=new Inter();
		inter.setPro_name(pro_name);
		inter.setInter_id(inter_id);
		inter.setInter_name(inter_name);
		inter.setInter_author(inter_author);
		inter.setInter_features(inter_features);
		inter.setInter_path(inter_path);
		inter.setInter_coding(inter_coding);
		inter.setInter_param(inter_param);
		inter.setOut_param(out_param);
		System.out.println(inter);
		
		Map<String, String> map=new HashMap<String, String>();
		if(interservice.updateInter(inter)>0){
			
			map.put("msg", "成功");
		}else{
			
			map.put("msg", "失败");
		}
		
		Gson gson=new Gson();
		String json=gson.toJson(map);
		
		return json;
	}
	
	@RequestMapping("delInter")
	@ResponseBody
	public String delInter(HttpServletRequest request){
		System.out.println("ok");
		int id=Integer.parseInt(request.getParameter("inter_id"));
		System.out.println(id);
		interservice.delInter(id);
		System.out.println("yes");
		Gson gson=new Gson();
		String json=gson.toJson(1);
		return json;
		
	}

}
