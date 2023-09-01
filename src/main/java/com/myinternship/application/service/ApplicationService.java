package com.myinternship.application.service;

import com.myinternship.application.mapper.ApplicationMapper;
import com.myinternship.application.model.ModelOfApplications;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private ApplicationMapper applicationMapper;

    public ApplicationService(ApplicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }

    public ModelOfApplications[] getApplications(){

        ModelOfApplications[] modelOfApplications = applicationMapper.selectApplications();
        return modelOfApplications;
    }
}
