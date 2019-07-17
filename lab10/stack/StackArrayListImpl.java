package stack;

import java.util.ArrayList;
import java.util.List;

public class StackArrayListImpt <T> implements Stack <T>{

    private ArrayList <T> stacklist=new ArrayList<T>();

    @Override
    public void push(T item){
        contents.add(item);
    }
    @Override
    public T pop (){
        return contents.remove(contents.size()-1);
    }
    @Override
	public boolean empty(){
        return contents.size()==0;
    }

    public List<T> toList(){
        return stacklist;
    }
	


}