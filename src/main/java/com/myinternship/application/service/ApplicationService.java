package com.myinternship.application.service;

import com.myinternship.application.mapper.ApplicationMapper;
import com.myinternship.application.model.ModelOfApplication;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private ApplicationMapper applicationMapper;

    public ApplicationService(ApplicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }

    public ModelOfApplication[] getApplications(){

        ModelOfApplication[] modelOfApplications = applicationMapper.selectApplications();
        return modelOfApplications;
    }

    public int addApplication(ModelOfApplication modelOfApplications){
        return applicationMapper.insertApplication(modelOfApplications);

    }
}
