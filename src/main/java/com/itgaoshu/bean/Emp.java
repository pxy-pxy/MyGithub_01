package com.itgaoshu.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/*
* 1.实体类需要实现序列化接口
* 2.属性类型改为其包名类型
* 3.在类上使用@Table注解 需要指定此列实体类对应的表
* 4.在唯一属性上使用@Id 注解指定表中关联主键
*5.如果表中字段名与属性名不一致 需要使用@Column 注解指定关联字段名
* */
@Table(name="emp")
public class Emp implements Serializable {
    @Id
    private Integer empno;
    private String ename;
    private  Double salary;
    private String hiredate;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
