package com.myinternship.application.mapper;

import com.myinternship.application.model.ModelOfApplication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApplicationMapper {

    @Select("SELECT * FROM APPLICATIONTABLE")
    ModelOfApplication[] selectApplications();

    @Insert("INSERT INTO APPLICATIONTABLE (id,name,identityNumber,address) VALUES (#{id},#{name},#{identityNumber},#{address})")
    int insertApplication(ModelOfApplication modelOfApplications);

}
