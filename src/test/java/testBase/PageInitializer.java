package testBase;

import pages.ConfugurePageElements;
import pages.LoginPageElements;
import pages.RunPageElements;
import pages.SelectProcedureExecutablePageElements;
import pages.SetUpPageElements;

public class PageInitializer extends BaseClass {

	protected static LoginPageElements loginPageElements;
	protected static ConfugurePageElements confugurePageElements;
	protected static SetUpPageElements setUpPageElements;
	protected static SelectProcedureExecutablePageElements selectProcedureExecutablePageElements;
	protected static RunPageElements runPageElements;
	
	public static void initializePageObjects() {
		selectProcedureExecutablePageElements = new SelectProcedureExecutablePageElements();
		loginPageElements	= new LoginPageElements();	
		confugurePageElements = new ConfugurePageElements();
		setUpPageElements = new SetUpPageElements();
		runPageElements = new RunPageElements();
	}
}
