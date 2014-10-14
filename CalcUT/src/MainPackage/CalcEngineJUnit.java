package MainPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcEngineJUnit {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test 
	public void testValue(){
		InvestmentCalc test = new InvestmentCalc();
		assertEquals("value should be 11007.03078125" ,test.investmentCalculator(10000, 3, 3.25));
		}
	
	}


