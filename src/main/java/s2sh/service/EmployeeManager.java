package s2sh.service;

import java.util.List;

import s2sh.model.entity.EmployeeEntity;

public interface EmployeeManager {
    public void add(EmployeeEntity employee);
    public List<EmployeeEntity> getAll();
    public EmployeeEntity get(Integer id);
    public void delete(Integer employeeId);
}
