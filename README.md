# PippingrockAssesment
**1. Framework Setup Instructions**
This automation framework is built on the Page Object Model (POM) design pattern with the following structure:

	1. Base Class
		Manages browser setup and teardown.
		Contains reusable configurations and common properties.

	2.Pages
		Each web page (or functionality like button, checkbox, etc.) is represented as a separate class.
		Encapsulates page locators and actions specific to that page.
	
	3.Common Elements Page
		Stores frequently used elements and methods.
		Provides a centralized way to access locators across different page classes.
	
	4.Locators Repository
		All locators are stored separately for reusability and maintainability.
	
	5.Tests
		Implemented using TestNG framework.
		Each test class focuses on validating a specific page or feature.
	
	6.Reporting
		Integrated reporting to view execution results.
		Helps in tracking test pass/fail status with detailed logs.
**2.Steps to Execute the Tests**
	1.Clone the Repository
		git clone https://github.com/RAHUL1716BN/PippingrockAssesment.git
		cd PippingrockAssesment/Assignment


	2.Import the Project
		Open the project in an IDE in Eclipse.
		Ensure Maven dependencies are downloaded.

	3.Configure Browser & Properties
		Update browser configurations in the Base class or properties file if needed.

	4.Run the Tests
		From IDE: Right-click the testng.xml file → Run as TestNG Suite.
	
 	5.View Reports
		Navigate to the test-output folder (default for TestNG reports).
		Open index.html to view the detailed execution report.

**3. Assumptions Made**
   The framework assumes Java, Selenium, and TestNG are installed and configured.
   The tests are written to run on a default browser setup (e.g., Chrome) unless updated in the Base class.
   Page classes and locators follow a consistent naming convention for easier maintenance.
   The reporting mechanism is based on TestNG’s default reports (additional reporting tools like ExtentReports may be integrated if required).
   No parallel execution is set up by default unless specified in testng.xml.

	
