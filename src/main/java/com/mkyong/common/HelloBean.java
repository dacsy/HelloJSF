package com.mkyong.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;


@ManagedBean
@SessionScoped
//luu session, khi update gia tri attribute cua bean thi se luu lai, lan sau truy cap se nhan duoc gia tri luu nay
public class HelloBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String select;
	
	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void valueChanged(ValueChangeEvent e){
		select = e.getNewValue().toString();
		System.out.println(select);
		if(select.equals("1"))
			name = "Tan Tai";
		else 
			name = "Dac Sy";
	}
	
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void ajaxValueChanged(AjaxBehaviorEvent event){
		System.out.println(value);
	}
	
}