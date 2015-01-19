package com.mkyong.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean(name="listenBean")
@SessionScoped
public class TestAjaxBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String hello = "Hello";
	private int length = hello.length();
	private int eventCount = 0;
	
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getEventCount() {
		return eventCount;
	}
	public void setEventCount(int eventCount) {
		this.eventCount = eventCount;
	}

	public void update(AjaxBehaviorEvent event) {
		length = hello.length();
		eventCount++;
	}
}
