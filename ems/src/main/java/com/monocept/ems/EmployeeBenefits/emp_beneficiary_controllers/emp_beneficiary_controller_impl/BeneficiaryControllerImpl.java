package com.monocept.ems.EmployeeBenefits.emp_beneficiary_controllers.emp_beneficiary_controller_impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.EmployeeBenefits.emp_beneficiary_controllers.BeneficiaryControllerInterface;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_dtos.BeneficiaryDTO;
import com.monocept.ems.EmployeeBenefits.emp_beneficiary_services.impl.BeneficiaryServiceImpl;




@RestController
@RequestMapping("/beneficiary")
@CrossOrigin(origins = "*")
public class BeneficiaryControllerImpl 
    implements BeneficiaryControllerInterface{


    @Autowired
    BeneficiaryServiceImpl beneficiaryServiceImpl;

    @Override
    @PostMapping("/create-beneficiary")
    public ResponseEntity<String> createBeneficiary
        (@RequestBody BeneficiaryDTO beneficiaryDTO) {
        System.out.println("Inside createBeneficiary()");
        
        boolean isCreatedBeneficiary 
            =  beneficiaryServiceImpl
                .createBeneficiary(beneficiaryDTO);
        String responseBody = "";

        if(isCreatedBeneficiary){
            responseBody = "Successfully created beneficiary";
           
        }else{
            responseBody = "Failure while creating beneficiary";
        }
        
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(responseBody);

    }

    @Override
    @GetMapping("/get-beneficiary-by-id")
    public ResponseEntity<BeneficiaryDTO> 
        getBeneficiaryByID(@RequestParam String id) {
        
        BeneficiaryDTO beneficiaryDTO 
            = beneficiaryServiceImpl
             .getBeneficiaryById(id);
        
        if(beneficiaryDTO != null){
            return ResponseEntity.status(HttpStatus.OK)
                .body(beneficiaryDTO);
        }
        return ResponseEntity.status(HttpStatus.OK)
        .body(null);
    }

    @Override
    @GetMapping("/get-all-beneficiary")
    public ResponseEntity<List<BeneficiaryDTO>> 
        getAllBeneficiary() {
        
        List<BeneficiaryDTO>  beneficiaryDTOList 
            = beneficiaryServiceImpl.getBeneficiaryList();
        

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(beneficiaryDTOList);
    }

    
    
    

}


