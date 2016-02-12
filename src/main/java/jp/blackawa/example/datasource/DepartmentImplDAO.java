package jp.blackawa.example.datasource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentImplDAO implements DepartmentDAO {

    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Department> queryDepartment() throws Exception {
        Connection conn = dataSource.getConnection();

        String sql = "Select dept_id, dept_no, dept_name from department";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Department> list = new ArrayList<Department>();
        while (rs.next()) {
            Long deptId = rs.getLong("dept_id");
            String deptNo = rs.getString("dept_no");
            String dept_name = rs.getString("dept_name");
            Department department = new Department(deptId, deptNo, dept_name);
            list.add(department);
        }
        return list;
    }
}
