package com.atguigu.maven;

public class HelloFriend {

	/**
	 * ��maven��������Ҫ����������jar��������Ŀ�� �����ͨ��������maven�ֿ��л�ȡ��
	 * ������ӵ��Ǳ���maven�ֿ⣬���ڱ��زֿ��п����ҵ������ȥʹ��
	 * ������õ����Լ���������Ŀ��������ͨ�������Ŀ��װ��maven���زֿ���
	 * @param name
	 * @return
	 */
	public String sayHelloToFriend(String name) {
		Hello hello = new Hello();
		String str = hello.sayHello(name) + " I am " + this.getMyName();
		System.out.println(str);
		return str;
	}

	public String getMyName() {
		return "John";
	}
}
