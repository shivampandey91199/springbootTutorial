package com.model;

public class Responsebean<T> {

	T data;
	int status;
	String msg;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static <T> Responsebean<T> getData(T data, String msg, int status) {
		Responsebean<T> rb = new Responsebean<T>();
		rb.setData(data);
		rb.setMsg(msg);
		rb.setStatus(status);
		return rb;
	}

}
