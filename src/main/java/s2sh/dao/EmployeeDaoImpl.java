package s2sh.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import s2sh.model.entity.EmployeeEntity;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(EmployeeEntity employee) {
        this.sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from EmployeeEntity").list();
    }

    @Override
    public EmployeeEntity get(Integer id) {
        return (EmployeeEntity) this.sessionFactory.getCurrentSession().createQuery("from EmployeeEntity where id=" + id).uniqueResult();
    }

    @Override
    public void delete(Integer employeeId) {
        EmployeeEntity employee = (EmployeeEntity) sessionFactory.getCurrentSession().load(EmployeeEntity.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }
    
    public void setSessionFactory(SessionFactory SessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
