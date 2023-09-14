import java.util.ArrayList;
import java.util.List;

public class Generic <T>{

    private List<T> list;

    @Override
    public String toString() {
        return "Generic list = "+ list;
    }

    public Generic() {
        this.list = new ArrayList<>();
    }

    public void add(T add){
        list.add(add);
    }
    public void remove(T remove){
        list.remove(remove);
    }

    public T getWithIndex(int index){

        return list.get(index);
    };

    public void print(){
        System.out.println(list);
    }
}
