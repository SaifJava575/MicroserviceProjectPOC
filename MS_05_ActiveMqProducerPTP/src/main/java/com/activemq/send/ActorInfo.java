package com.activemq.send;

import java.io.Serializable;

public class ActorInfo implements Serializable{
	
	public ActorInfo(Integer id, String name, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}
	private Integer id;
	private String name;
	private String addrs;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

}
