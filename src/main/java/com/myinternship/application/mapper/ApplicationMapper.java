package com.myinternship.application.mapper;

import com.myinternship.application.model.ModelOfApplication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApplicationMapper {

    @Select("SELECT * FROM APPLICATIONTABLE")
    ModelOfApplication[] selectApplications();

    @Insert("INSERT INTO APPLICATIONTABLE (id,name,identityNumber,address,phoneNumber,email,birthDate,hasExperience,choosingReason,selectedLocation,amount,additionalNotes) VALUES (#{id},#{name},#{identityNumber},#{address},#{phoneNumber},#{email},#{birthDate},#{hasExperience},#{choosingReason},#{selectedLocation},#{amount},#{additionalNotes})")
    int insertApplication(ModelOfApplication modelOfApplications);

}
