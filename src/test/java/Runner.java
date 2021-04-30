public class Runner {

    public static void main(String[] args) {
        FinalKeywordTest obj = new FinalKeywordTest();
        obj.TestFinalvariablePositiveFlow();

        FinalKeywordSubClass obj2 = new FinalKeywordSubClass();
        obj2.TestSuperClassFinalVariableAccess();
        obj2.TestFinalvariablePositiveFlow();
        int s = obj2.totalmarks;
        System.out.println("s  is "+s);

        FinalClassInherit obj3 = new FinalClassInherit(100);
    }

}
