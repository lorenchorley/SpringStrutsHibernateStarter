package s2sh.dao;

import java.util.List;
import s2sh.model.entity.EmployeeEntity;

public interface EmployeeDao {
    
    public void add(EmployeeEntity employee);
    
    public List<EmployeeEntity> getAll();
    
    public EmployeeEntity get(Integer id);
    
    public void delete(Integer id);
    
}