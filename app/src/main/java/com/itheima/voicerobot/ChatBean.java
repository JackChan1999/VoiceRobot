package com.itheima.voicerobot;

/**
 * 聊天信息对象
 * 
 * @author Kevin
 * 
 */
public class ChatBean {

	public String text;// 内容
	public boolean isAsker;// true表示提问者,否则是回答者

	public int imageId = -1;// 图片id

	public ChatBean(String text, boolean isAsker, int imageId) {
		this.text = text;
		this.isAsker = isAsker;
		this.imageId = imageId;
	}

}
