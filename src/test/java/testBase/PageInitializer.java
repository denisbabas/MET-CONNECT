package testBase;

import pages.ConfugurePageElements;
import pages.FileAndFoldersPageElements;
import pages.InstrumentConfigurationPageElementsOne;
import pages.InstrumentControlPageElements;
import pages.InstrumentsPageElements;
import pages.LoginPageElements;
import pages.MetrologyPageElements;
import pages.PostTestDialogPageElements;
import pages.RecurringElemets;
import pages.ResultsPageElements;
import pages.RunPageElements;
import pages.RuntimeConfigurationPageElements;
import pages.SafetyPageElements;
import pages.SelectProcedureExecutablePageElements;
import pages.SetUpPageElements;
import pages.SimulationModePageElements;
import pages.WorkstationConfigurationPageElements;


public class PageInitializer extends BaseClass {

	protected static LoginPageElements loginPageElements;
	protected static ConfugurePageElements confugurePageElements;
	protected static SetUpPageElements setUpPageElements;
	protected static SelectProcedureExecutablePageElements selectProcedureExecutablePageElements;
	protected static RunPageElements runPageElements;
    protected static InstrumentConfigurationPageElementsOne instrumentConfigurationPageElementsOne;
	protected static WorkstationConfigurationPageElements workstationConfigurationPageElements;
	protected static SimulationModePageElements simulationModePageElements;
	protected static SafetyPageElements safetyPageElements;
	protected static RuntimeConfigurationPageElements runtimeConfigurationPageElements;
	protected static ResultsPageElements resultsPageElements;
	protected static PostTestDialogPageElements postTestDialogPageElements;
	protected static MetrologyPageElements metrologyPageElements;
	protected static InstrumentsPageElements instrumentsPageElements;
	protected static FileAndFoldersPageElements fileAndFoldersPageElements;
	protected static InstrumentControlPageElements instrumentControlPageElements;
	protected static RecurringElemets recurringElemets;
	
	public static void initializePageObjects() {
		selectProcedureExecutablePageElements = new SelectProcedureExecutablePageElements();
		loginPageElements	= new LoginPageElements();	
		confugurePageElements = new ConfugurePageElements();
		setUpPageElements = new SetUpPageElements();
		runPageElements = new RunPageElements();
		instrumentConfigurationPageElementsOne = new InstrumentConfigurationPageElementsOne();
		workstationConfigurationPageElements = new WorkstationConfigurationPageElements();
		simulationModePageElements = new SimulationModePageElements();
		safetyPageElements = new SafetyPageElements();
		runtimeConfigurationPageElements = new RuntimeConfigurationPageElements();
		resultsPageElements = new ResultsPageElements();
		postTestDialogPageElements = new PostTestDialogPageElements();
		metrologyPageElements = new MetrologyPageElements();
		instrumentsPageElements  = new InstrumentsPageElements();
		fileAndFoldersPageElements = new FileAndFoldersPageElements();
		instrumentControlPageElements = new InstrumentControlPageElements();
		recurringElemets = new RecurringElemets();
	}
}
