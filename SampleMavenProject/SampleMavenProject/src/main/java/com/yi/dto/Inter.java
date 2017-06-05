package com.yi.dto;

public class Inter {
	
	private String pro_name;//项目名
	private int inter_id;//接口id
	private String inter_name;//接口名
	private String inter_author;//接口的作者
	private String inter_features;//接口的描述
	private String inter_path;//接口的路径
	private String inter_coding;//接口的编码
	private String inter_param;//接口的入参
	private String out_param;//接口的出参
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getInter_id() {
		return inter_id;
	}
	public void setInter_id(int inter_id) {
		this.inter_id = inter_id;
	}
	public String getInter_name() {
		return inter_name;
	}
	public void setInter_name(String inter_name) {
		this.inter_name = inter_name;
	}
	public String getInter_author() {
		return inter_author;
	}
	public void setInter_author(String inter_author) {
		this.inter_author = inter_author;
	}
	public String getInter_features() {
		return inter_features;
	}
	public void setInter_features(String inter_features) {
		this.inter_features = inter_features;
	}
	public String getInter_path() {
		return inter_path;
	}
	public void setInter_path(String inter_path) {
		this.inter_path = inter_path;
	}
	public String getInter_coding() {
		return inter_coding;
	}
	public void setInter_coding(String inter_coding) {
		this.inter_coding = inter_coding;
	}
	public String getInter_param() {
		return inter_param;
	}
	public void setInter_param(String inter_param) {
		this.inter_param = inter_param;
	}
	public String getOut_param() {
		return out_param;
	}
	public void setOut_param(String out_param) {
		this.out_param = out_param;
	}
	public Inter(String pro_name, int inter_id, String inter_name, String inter_author, String inter_features,
			String inter_path, String inter_coding, String inter_param, String out_param) {
		super();
		this.pro_name = pro_name;
		this.inter_id = inter_id;
		this.inter_name = inter_name;
		this.inter_author = inter_author;
		this.inter_features = inter_features;
		this.inter_path = inter_path;
		this.inter_coding = inter_coding;
		this.inter_param = inter_param;
		this.out_param = out_param;
	}
	public Inter() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Inter [pro_name=" + pro_name + ", inter_id=" + inter_id + ", inter_name=" + inter_name
				+ ", inter_author=" + inter_author + ", inter_features=" + inter_features + ", inter_path=" + inter_path
				+ ", inter_coding=" + inter_coding + ", inter_param=" + inter_param + ", out_param=" + out_param + "]";
	}
	
}
