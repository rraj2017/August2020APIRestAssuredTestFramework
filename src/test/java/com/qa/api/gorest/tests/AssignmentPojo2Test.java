package com.qa.api.gorest.tests;

import org.testng.annotations.Test;

import com.qa.api.gorest.pojo.Address;
import com.qa.api.gorest.pojo.AssignmentPojo2;
import com.qa.api.gorest.pojo.Assignmentpojo1;
import com.qa.api.gorest.util.TestUtil;

public class AssignmentPojo2Test {
	@Test
	public void test1() {
		Address address = new Address("5040" ,"Tower B" ,"16th Avenue" ,"Gaur city2","Ludhiana" ,"Punjab","900100");
		AssignmentPojo2 assign2 = new AssignmentPojo2("rishi", "raj", "LNG_115" ,"Ludhiana" ,"Business" ,address);
		String jsonPayload = TestUtil.getSerializedJSON(assign2);
		System.out.println(jsonPayload);
		
	}
}
