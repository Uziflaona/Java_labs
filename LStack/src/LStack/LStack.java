package LStack;

public class LStack{
    private int index = -1;
    private T [] values;

    public LStack(int i){

    }

    public void push(T value){
        values[++index] = value;
    }

    public T pop(){
        return (values[index--]);
    }

    public boolean isEmpty (){
        return (index == -1);
    }

    public boolean isFull (){
        return (index == values.length - 1);
    }
}
