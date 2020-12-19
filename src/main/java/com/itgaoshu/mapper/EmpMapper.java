package com.itgaoshu.mapper;

import com.itgaoshu.bean.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
/*
* 自动以Mapper接口需要继承自tk.mybatis.mapper.common.Mapper<T>接口
* */

public interface EmpMapper extends tk.mybatis.mapper.common.Mapper<Emp> {

   /* @Select("select * from emp")
    public List<Emp> selectEmpList();*/
}
