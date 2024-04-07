import java.util.function.Function;

public class Main {
    public static void main(String... args){
        new Main().intFunctionKata();
        new Main().stringFunctionKata();

    }

    public void intFunctionKata(){
        Function<Integer, Integer> myFunction = /* blank */;

        int functionResult = myFunction.apply(4);



        System.out.println(functionResult);
        // Should print: 6
    }

    public void stringFunctionKata(){
        Function</* blank */> myFunction = /* blank */;

        String functionResult = /* blank */;



        System.out.println(functionResult);
        // Should print: Hello World!
    }
}
