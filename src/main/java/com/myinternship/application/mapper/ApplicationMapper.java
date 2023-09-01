package com.myinternship.application.mapper;

import com.myinternship.application.model.ModelOfApplications;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApplicationMapper {

    @Select("SELECT * FROM APPLICATIONTABLE")
    ModelOfApplications[] selectApplications();

}
