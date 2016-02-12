package jp.blackawa.example.datasource;

import java.util.List;

public interface DepartmentDAO {
    List<Department> queryDepartment() throws Exception;
}
