package com.duowan.reportengine.util;

import org.junit.Assert;
import org.junit.Test;

public class AggrFunctionUtilTest extends Assert{
	@Test
	public void test() {
		System.out.println(AggrFunctionUtil.sum(CubeBuilderTest.rows,"click"));
		System.out.println(AggrFunctionUtil.avg(CubeBuilderTest.rows,"click"));
		
		System.out.println(AggrFunctionUtil.min(CubeBuilderTest.rows,"click"));
		System.out.println(AggrFunctionUtil.max(CubeBuilderTest.rows,"click"));
		System.out.println(AggrFunctionUtil.count(CubeBuilderTest.rows,"click"));
		
		assertTrue(AggrFunctionUtil.sum(CubeBuilderTest.rows,"click") - 900 < 0.0001);
		assertTrue(AggrFunctionUtil.avg(CubeBuilderTest.rows,"click") - 180 < 0.0001);
		
		assertEquals(100,AggrFunctionUtil.min(CubeBuilderTest.rows,"click"));
		assertEquals(300,AggrFunctionUtil.max(CubeBuilderTest.rows,"click"));
		assertEquals(5,AggrFunctionUtil.count(CubeBuilderTest.rows,"click"));
		assertEquals(100,AggrFunctionUtil.first(CubeBuilderTest.rows,"click"));
		assertEquals(200,AggrFunctionUtil.last(CubeBuilderTest.rows,"click"));
		
		
	}
}
