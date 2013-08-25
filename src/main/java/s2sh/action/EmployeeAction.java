package s2sh.action;

import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import s2sh.model.entity.EmployeeEntity;
import s2sh.service.EmployeeManager;

@Component(value = "employeeAction")
public class EmployeeAction implements ModelDriven {

    EmployeeEntity employee = new EmployeeEntity();
    List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();

    EmployeeManager employeeManager;

    @Autowired
    public void setEmployeeManager(EmployeeManager employeeManager) {
        System.out.println("employeeAction.setEmployeeManager(" + ((employeeManager == null) ? "null" : "employeeManager") + ") called.");
        this.employeeManager = employeeManager;
    }

    @Override
    public Object getModel() {
        return employee;
    }

    public List<EmployeeEntity> getEmployeeList() {
        return employeeManager.getAll();
    }

    public void setEmployeeList(List<EmployeeEntity> employeeList) {
        this.employeeList = employeeList;
    }

    public String addEmployee() throws Exception {
         
        employeeManager.add(employee);
        listEmployees();

        return "success";
    }
    
    public String listEmployees() throws Exception {
        employeeList = employeeManager.getAll();

        return "success";
    }
	
}