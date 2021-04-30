public final class FinalClassInherit {

    final int marksNullinitialize;
    public FinalClassInherit(int marksNullinitialize)
    {
        this.marksNullinitialize = marksNullinitialize;
        System.out.println("Final Class Not Possible to extend ,it means no inheritance; output : Cannot inherit from final 'FinalClassInherit' ");
        System.out.println("Final Not allowed in constructor");
        System.out.println("Final variable can be initialized as null and the value should be set only through constructor :"+marksNullinitialize);
    }
}
