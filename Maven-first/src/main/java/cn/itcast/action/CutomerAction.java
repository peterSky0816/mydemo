package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;

public class CutomerAction extends ActionSupport {
	
	private long custId;
	private String name;
	private int age;
	public CutomerAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public CutomerAction(long custId, String name, int age) {
		super();
		this.custId = custId;
		this.name = name;
		this.age = age;
	}

	public long getCustId() {
		return custId;
	}
	
	public void setCustId(long custId) {
		this.custId = custId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String findById(){
		System.out.println("前端传过来的客户ID"+custId);
		return SUCCESS;
	}
}
