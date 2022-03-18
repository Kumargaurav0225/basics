package oops.inheritance;

public class InheritanceBasics {

    String input="";
    {
        this.input="hi";
        System.out.println("Parent init block "+input);
    }

    InheritanceBasics(){
        System.out.println("In Parent Default");
    }

    InheritanceBasics(String input){
        if (input!=null){
            this.input=input;
        }
        System.out.println("In Parent Params "+input);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "InheritanceBasics{" +
                "input='" + input + '\'' +
                '}';
    }
}

