package com.itheima.voicerobot;

import java.util.ArrayList;

/**
 * 语音信息封装
 * 
 * @author Kevin
 * 
 */
public class VoiceBean {

	public ArrayList<WSBean> ws;

	public class WSBean {
		public ArrayList<CWBean> cw;
	}

	public class CWBean {
		public String w;
	}
}
