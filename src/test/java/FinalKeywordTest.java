public class FinalKeywordTest {

    final int totalmarks = 100;

    public final void TestFinalvariablePositiveFlow()
    {
        System.out.println("Final Variable Test total Marks :"+totalmarks);

        //TestFinalVariableNegativeFlow();
    }

    //Compilation Error
    /*public void TestFinalVariableNegativeFlow()
    {
        System.out.println("Overrided final variable value :"+(totalmarks =200) ) ;
    }*/


}
