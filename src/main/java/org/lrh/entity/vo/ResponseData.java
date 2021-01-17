package org.lrh.entity.vo;

public class ResponseData {
	private String message;
	
	private Integer code;
	
	private Object data;
	
	private ResponseData() {
		
	}
	
	public static ResponseData success(Object b) {
		ResponseData a = new ResponseData();
		a.setMessage("处理完成！");
		a.setCode(200);
		a.setData(b);
		return a;	
	}
	
	public static ResponseData error() {
		ResponseData a = new ResponseData();
		a.setMessage("请求失败！");
		a.setCode(500);
		return a;	
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
