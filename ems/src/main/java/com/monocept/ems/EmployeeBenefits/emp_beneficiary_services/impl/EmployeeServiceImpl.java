package com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.EmployeeDTO;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_entities.EmployeeModel;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_repository.EmployeeRepository;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.EmployeeServiceInterface;

@Service
public class EmployeeServiceImpl 
    implements EmployeeServiceInterface {
   
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(EmployeeDTO employeeDTO) {
        System.out.println("Inside createEmployee method");
        System.out.println(employeeDTO.getFirst_name());
        employeeRepository.save(employeeDTO.toEmployeeModel());  
    }

    @Override
    public EmployeeDTO getEmpById(String empIdStr) {
        System.out.println("Inside getEmpById method");
        int empId = -1;
        try{
            empId = Integer.parseInt(empIdStr);
            if(empId != -1){
                EmployeeModel employeeModel =  employeeRepository
                    .getReferenceById(empId);

                return employeeModel.toEmployeeDTO(); 
            }

        }catch(Exception e){
            System.out.println("getEmpById() : exception "+e );
        }

        return null;
    }


    
    @Override
    public List<EmployeeDTO> getEmployeeList() {
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        
        for(EmployeeModel employeeModel : employeeRepository.findAll()){

            // System.out.println("Emp :: "+employeeModel.getFirst_name());
            employeeDTOList.add(employeeModel.toEmployeeDTO());
        }

        return employeeDTOList;
    }


    @Override
    public void updateEmployeeById(int empId, EmployeeDTO employeeDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployeeById'");
    }

    @Override
    public void deleteEmployeeById(int empId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployeeById'");
    }


}
