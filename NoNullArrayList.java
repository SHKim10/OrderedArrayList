import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public T set(int index, T element){
    if (element == null) throw new IllegalArgumentException();
    return super.set(index, element);
  }
}
