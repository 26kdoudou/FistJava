package com.dmm.git;

import com.dmm.pojo.User;

public class FirstGit extends User {
	
	public void Sleep() {
		System.out.println("葛优躺！！！");
	}

	public static void main(String[] args) {
		
		System.out.println("我的第一个上传到github的项目");
		
		User user =new User();
		user.setId(1);
		user.setUsername("流氓兔");
		user.setPwd("123456");
		System.out.println(user);
		
		FirstGit fGit=new FirstGit();
		fGit.Sleep();
		
	}

}
