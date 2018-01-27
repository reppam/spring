package org.martin.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext contex = new FileSystemXmlApplicationContext("Beans.xml");
		Insurance status = contex.getBean("myInsurance", Insurance.class);
		System.out.println(status.showStatus());
		contex.close();		// cals end() method
	}

}
