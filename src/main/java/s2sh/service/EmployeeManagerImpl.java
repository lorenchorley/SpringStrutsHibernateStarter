package s2sh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import s2sh.dao.EmployeeDao;

import s2sh.model.entity.EmployeeEntity;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
	
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public void add(EmployeeEntity employee) {
        employeeDao.add(employee);
    }

    @Override
    @Transactional
    public List<EmployeeEntity> getAll() {
        return employeeDao.getAll();
    }

    @Override
    @Transactional
    public EmployeeEntity get(Integer id) {
        return employeeDao.get(id);
    }

    @Override
    @Transactional
    public void delete(Integer employeeId) {
        employeeDao.delete(employeeId);
    }

    public void setEmployeeDAO(EmployeeDao employeeDAO) {
        this.employeeDao = employeeDAO;
    }

}
