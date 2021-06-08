package ArithmeticOperations.Assignment3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.testng.Assert;
import org.testng.annotations.*;




public class ArithmeticOperationTest {
	
	
	FunctionalClass obj;
	int Result;
	
	
	//--------------Before Groups--------------
	
	//For Regression Test--
	@BeforeGroups("RegressionTest")
	public void initGroups()
	{
		obj=new FunctionalClass();
	}
	
	//For Smoke Test--
	@BeforeGroups("SmokeTest")
	public void initBeforeSmoke() {
		obj = new FunctionalClass();
	}
	
	
	//--------------Before Class------------
	
	@BeforeClass
	public void init() {
		obj= new FunctionalClass();
	}
	
	
//--------------------Before Method--------------
	@BeforeMethod
	public void ReintialisingResult()
	{
		Result=0;
	}
	
	//----------------------------ADDITION TEST CASES---------------------------------//
	
	
	@Test(priority=1, dataProvider="ProvideNumbers", groups= {"RegressionTest"})
	public void TestAddtion(int num1, int num2, int result) {

		Result = obj.Addition(num1,num2);
		Assert.assertEquals(Result, result, "Addition doesnt work with positive numbers");
	}

	@DataProvider
	public Object[][] ProvideNumbers() {
		Object[][] SetOfValues = new Object[3][3];
		
		/* 
		 	100+20    	=120
		 	10+-2   	=8
			1000+2000  	=3000
			
		 */
		
		 SetOfValues [0][0]=100;
		 SetOfValues [0][1]=20;
		 SetOfValues [0][2]=120;
		 
		 SetOfValues [1][0]=10;
		 SetOfValues [1][1]=-2;
		 SetOfValues [1][2]=8;
		 
		 SetOfValues [2][0]=1000;
		 SetOfValues [2][1]=2000;
		 SetOfValues [2][2]=3000;
		 
		 
		 
		 return SetOfValues;
	}
	
	//----------------------------SUBTRACTION TEST CASES---------------------------------------//

	
	@Test(priority=1, dataProvider="ProvideValues", groups= {"SmokeTest"})
	public void TestSubtraction(int num1, int num2, int result) {

		Result = obj.Subtraction(num1,num2);
		Assert.assertEquals(Result, result, "Addition doesnt work with positive numbers");
	}

	@DataProvider
	public Object[][] ProvideValues() {
		Object[][] SetOfValues = new Object[3][3];
		
		/* 
		 	100-20		=80
		 	10-(-2)		=12
		 	1000-2000	=-1000
		 */
		
		 SetOfValues [0][0]=100;
		 SetOfValues [0][1]=20;
		 SetOfValues [0][2]=80;
		 
		 SetOfValues [1][0]=10;
		 SetOfValues [1][1]=-2;
		 SetOfValues [1][2]=12;
		 
		 SetOfValues [2][0]=1000;
		 SetOfValues [2][1]=2000;
		 SetOfValues [2][2]=-1000;
		 
		 
		 
		 return SetOfValues;
	}

	
	//----------------------------MULTIPLICATION TEST CASES---------------------------------------//

	
		@Test(priority=1, dataProvider="ProvideIntegerValues")
		public void TestMultiplicationWithPositiveNumbers(int num1, int num2, int result) {

			Result = obj.Multiplication(num1,num2);
			Assert.assertEquals(Result, result, "Addition doesnt work with positive numbers");
		}

		@DataProvider
		public Object[][] ProvideIntegerValues() {
			Object[][] SetOfValues = new Object[3][3];
			
			/* 
			 	1*2    		=2
			 	10*20   	=200
				1000*2000  	=2000000
			 */
			
			 SetOfValues [0][0]=1;
			 SetOfValues [0][1]=2;
			 SetOfValues [0][2]=2;
			 
			 SetOfValues [1][0]=10;
			 SetOfValues [1][1]=20;
			 SetOfValues [1][2]=200;
			 
			 SetOfValues [2][0]=1000;
			 SetOfValues [2][1]=2000;
			 SetOfValues [2][2]=2000000;
			 
			 
			 
			 return SetOfValues;
		}

		//----------------------------DIVISION TEST CASES---------------------------------------//
		@Test
		public void TestDivision() 
		{
		
			 Result = obj.Division(10,2);
			Assert.assertEquals(Result,5, "Addition doesnt work with positive numbers");
		
		}
		
		
		//------------After Method To set result at 0 ------------------
		@AfterMethod
		public void clearResult() {
			Result = 0;
		}

		
	   //-----------After Class To make object null------------------
		@AfterClass
		public void tearDown() {
			obj = null;
		}
		
		//-----------------------------------SAVING REPORT-----------------------------------------------------------//

		
		//Before Suite ----
		@BeforeSuite
		@Parameters({"RequestID"})

		public void createResultFolder(String ResultDir) {
			System.out.println("I am in before Suite");
			try
			{
			Files.createDirectories(Paths.get("./"+ResultDir));
			}
			catch (IOException e)
			{
				System.out.println("Problem in creating a Result Directory");
			}
			
		}
		
		//After Suite ---

		@Parameters({"RequestID"})
		@AfterSuite

		public void copyResultFile(String RequestID) throws Exception{
			System.out.println("I am in after Suite");
			try {
				Files.copy(Paths.get("C:\\Users\\lenovo\\eclipse-workspace\\Assignment3\\test-output\\emailable-report.html"), Paths.get("./"+RequestID+"/Result.html"),StandardCopyOption.REPLACE_EXISTING);	}
			catch (IOException e) {
				// TODO Auto-generated catch block
					System.out.println("Problem in copying Result file");
			}
		}

}
