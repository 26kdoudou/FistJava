package com.dmm.git;

import com.dmm.pojo.User;

public class FirstGit extends User {
	
	public void Sleep() {
		System.out.println("�����ɣ�����");
	}

	public static void main(String[] args) {
		
		System.out.println("�ҵĵ�һ���ϴ���github����Ŀ");
		
		User user =new User();
		user.setId(1);
		user.setUsername("��å��");
		user.setPwd("123456");
		System.out.println(user);
		
		FirstGit fGit=new FirstGit();
		fGit.Sleep();
		
	}

}
