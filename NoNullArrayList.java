import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T value){
    if (value == null) throw new IllegalArgumentException("Null is an illegal element.");
    return super.add(value);
  }

  public void add(int index, T value){
    if (value == null) throw new IllegalArgumentException("Null is an illegal element.");
    super.add(index, value);
  }

  public T set(int index, T value){
    if (value == null) throw new IllegalArgumentException("Null is an illegal element.");
    return super.set(index, value);
  }
}
