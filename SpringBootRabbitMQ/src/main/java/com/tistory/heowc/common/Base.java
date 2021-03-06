package com.tistory.heowc.common;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Base implements Serializable {

	private Long index;
	private String content;
	
	public Base() {}

	public static Base of(Long index, String content) {
		return new Base(index, content);
	}

	public Base(Long index, String content) {
		this.index = index;
		this.content = content;
	}
	
	public void setIndex(long index) {
		this.index = index;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Long getIndex() {
		return index;
	}
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return "Base [index=" + index + ", content=" + content + "]";
	}
}
