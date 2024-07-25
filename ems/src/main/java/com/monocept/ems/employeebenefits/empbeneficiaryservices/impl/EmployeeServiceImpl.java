package com.monocept.ems.employeebenefits.empbeneficiaryservices.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.EmployeeServiceInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeDTO;
import com.monocept.ems.employeebenefits.empbenefitsentities.EmployeeModel;
import com.monocept.ems.employeebenefits.empbenefitsrepository.EmployeeRepository;

@Service
public class EmployeeServiceImpl 
    implements EmployeeServiceInterface {
   
    private static Logger logger =
        Logger.getLogger(EmployeeServiceImpl.class.getName());
    
    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public EmployeeDTO getEmpById(String empIdStr) {
        int empId = -1;
        try{
            empId = Integer.parseInt(empIdStr);
            if(empId != -1){
                EmployeeModel employeeModel =  employeeRepository
                    .getReferenceById(empId);

                return employeeModel.toEmployeeDTO(); 
            }

        }catch(Exception e){
            logger.warning("getEmpById() : exception  :: "+e);
        }

        return null;
    }


    
    @Override
    public List<EmployeeDTO> getEmployeeList() {
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        
        for(EmployeeModel employeeModel : employeeRepository.findAll()){

            employeeDTOList.add(employeeModel.toEmployeeDTO());
        }

        return employeeDTOList;
    }



}
