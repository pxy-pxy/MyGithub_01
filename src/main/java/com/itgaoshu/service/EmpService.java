package com.itgaoshu.service;

import com.itgaoshu.bean.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {

    public List<Emp> selectEmpList();
}
