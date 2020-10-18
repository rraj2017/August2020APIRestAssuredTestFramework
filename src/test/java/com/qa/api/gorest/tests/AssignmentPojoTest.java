package com.qa.api.gorest.tests;

import org.testng.annotations.Test;

import com.qa.api.gorest.pojo.Assignmentpojo1;
import com.qa.api.gorest.util.TestUtil;

public class AssignmentPojoTest {
	@Test
	public void test1() {
		Assignmentpojo1 assign = new Assignmentpojo1("Apple", "Red", "Large");
		String jsonPayload = TestUtil.getSerializedJSON(assign);
		System.out.println(jsonPayload);
		
	}

}
