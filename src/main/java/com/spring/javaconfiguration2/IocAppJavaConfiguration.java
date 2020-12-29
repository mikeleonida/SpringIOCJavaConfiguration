package com.spring.javaconfiguration2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.bean.javaconfiguration2.Department;
import com.spring.bean.javaconfiguration2.Emp;


@Configuration
public class IocAppJavaConfiguration {
	
	@Bean
	public Emp userObj() {
        Emp e = new Emp();
        e.setEmpNo(100);
        e.setEmpName("Phil Smith");
        e.setCity("Washington");
        return e;
    }
	
	@Bean
	@Scope("prototype")
	public Emp user2() {
		Emp e = new Emp();
		e.setEmpNo(101);
        e.setEmpName("John Wiseman");
        e.setCity("New Jersey");
        return e;
	}
	
	@Bean
    public Department salesDept() {
		Department d = new Department();
        d.setDeptName("Sales");
        d.setEmployee(userObj());
        return d;
    }

	@Bean
	public Emp newUser() {
		return new Emp(200, "Rajesh", "New Delhi");
	}
	
	@Bean
	public Department newDepartment() {
		return new Department("Admin", newUser());
	}
}
