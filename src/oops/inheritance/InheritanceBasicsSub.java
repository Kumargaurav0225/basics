package oops.inheritance;

public class InheritanceBasicsSub extends InheritanceBasics{
    String input="";
    {
        this.input="hello";
        System.out.println("Child init block "+input);
    }

    public InheritanceBasicsSub() {
        System.out.println("In Child Default");
    }

    public InheritanceBasicsSub(String input) {
        super(input);
        System.out.println("In Child Params "+input);
    }

    @Override
    public String getInput() {
        return input;
    }

    @Override
    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "InheritanceBasicsSub{" +
                "input='" + input + '\'' +
                '}';
    }
}
