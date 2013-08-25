package s2sh.dao;

import java.util.List;

public interface BasicDao<E, ID> {
    
    public void add(E entity);
    public List<E> getAll();
    public E get(ID id);
    public void delete(ID id);
    
}