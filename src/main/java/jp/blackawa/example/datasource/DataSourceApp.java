package jp.blackawa.example.datasource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DataSourceApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("datasource/spring-module.xml");
        DepartmentDAO dao = (DepartmentDAO) context.getBean("departmentDAO");
        List<Department> depts = dao.queryDepartment();
        for (Department dept : depts) {
            System.out.println("Dept ID " + dept.getDeptId());
            System.out.println("Dept No " + dept.getDeptNo());
            System.out.println("Dept Name " + dept.getDeptName());
        }
    }
}
