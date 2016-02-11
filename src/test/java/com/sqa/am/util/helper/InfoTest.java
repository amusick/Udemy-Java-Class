/**
 * File Name: InfoTest.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.am.util.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * InfoTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class InfoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs Before the Class executes @BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs After the Class executes @AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Do setup for Test Method @Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Do Tear Down for Test Method @After");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#display2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testDisplay2DInfo() {
		System.out.println("\t\t Test for testDisplay2DInfo @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#displayInfo(java.lang.Object)}.
	 */
	@Test
	public void testDisplayInfoObject() {
		System.out.println("\t\t Test for testDisplayInfoObject @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#displayInfo(java.lang.Object[])}.
	 */
	@Test
	public void testDisplayInfoObjectArray() {
		System.out.println("\t\t Test for testDisplayInfoObjectArray @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#displayInfo(java.lang.Object, java.lang.Object, java.lang.Object[])}
	 * .
	 */
	@Test
	public void testDisplayInfoObjectObjectObjectArray() {
		System.out.println("\t\t Test For testDisplayInfoObjectObjectObjectArray @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#get2DInfo(java.lang.Object[][])}.
	 */
	@Test
	public void testGet2DInfo() {
		System.out.println("\t\t Test for testGet2DInfo @Test");
	}

	/**
	 * Test method for
	 * {@link com.sqa.jf.util.helper.Info#getInfo(java.lang.Object)}.
	 */
	@Test
	public void testGetInfo() {
		System.out.println("\t\t Test for testGetInfo @Test");
	}
}
