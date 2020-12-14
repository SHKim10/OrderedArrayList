public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  //Helper method for finding the correct index to add to
  private int insertIndex(T element){
    for (int i = 0; i < size(); i++){
      if (element.compareTo(super.get(i)) < 0){
        return i;
      }
    }
    return size();
  }

  public boolean add(T element){
    if (element == null) throw new IllegalArgumentException("Null is an illegal element.");
    super.add(insertIndex(element), element);
    return true;
  }

  public void add(int index, T element){
    add(element);
  }

  public T set(int index, T element){
    if (element == null) throw new IllegalArgumentException("Null is an illegal element.");
    T result = super.remove(index);
    add(element);
    return result;
  }
}
