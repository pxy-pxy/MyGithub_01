package com.itgaoshu.service.impl;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.mapper.EmpMapper;
import com.itgaoshu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService{

    @Resource
    private EmpMapper empMapper;
    /*
    * 测试:redis缓存
    *
    * @Cacheable("selectEmpList")注释中的selectEmpList表示
    *   在缓存区域中开启了一个名称空间为selectEmpList的缓存,
    *   selectEmpList缓存中存储的就是查询的用户列表信息
    * */
    @Cacheable("selectEmpList")
    public List<Emp> selectEmpList(){
        System.out.println("如果第二次访问没有打印这句话,说明是从缓存中查询,没有去数据库");
        return empMapper.selectAll();
    }

}
