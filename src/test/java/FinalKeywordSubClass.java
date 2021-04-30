public class FinalKeywordSubClass extends FinalKeywordTest{

    //tip - Statements always inside the method

    public FinalKeywordSubClass() // Constructor
    {
        System.out.println("Create the copy of the Parent Class final method");
        super.TestFinalvariablePositiveFlow();
        System.out.println("using super to access final variable value using constructor: "+super.totalmarks);
    }

    public void TestSuperClassFinalVariableAccess()
    {
        System.out.println("Test Super Class Final Variable access "+totalmarks);
    }

    // Final method cannot be overrided
  /*  public final void TestFinalvariablePositiveFlow()
    {
        System.out.println("Final Variable Test total Marks :"+totalmarks);

        //TestFinalVariableNegativeFlow();
    }
    */


}
