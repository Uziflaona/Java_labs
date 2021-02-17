package LStack;

public class Main {

    public static void main(String[] args) {
        LStack stack = new LStack(10);
        for (int i=0; i<10; i++){
            stack.push("hello:");
        }
        System.out.println("hey");
        while(!stack.isEmpty()){
//        for (int i=0; i<10; i++){
            System.out.println(stack.pop());
        }
    }
}
