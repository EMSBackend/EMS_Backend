package com.monocept.ems.employeebenefits.empbeneficiarycontrollers.empbeneficiarycontrollerimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.employeebenefits.empbeneficiarycontrollers.BeneficiaryControllerInterface;
import com.monocept.ems.employeebenefits.empbeneficiarydtos.BenefitDTO;
import com.monocept.ems.employeebenefits.empbeneficiaryservices.impl.BeneficiaryServiceImpl;




@RestController
@RequestMapping("/beneficiary")
@CrossOrigin(origins = "*")
public class BeneficiaryControllerImpl 
    implements BeneficiaryControllerInterface{


    @Autowired
    BeneficiaryServiceImpl beneficiaryServiceImpl;


    @Override
    @GetMapping("/get-beneficiary-by-id")
    public ResponseEntity<BenefitDTO> 
        getBenefitByID(@RequestParam String id) {
        // null and empty check on employee id before fetching Benneficary details
        BenefitDTO beneficiaryDTO 
            = beneficiaryServiceImpl
             .getBenefitById(id);
        
        if(beneficiaryDTO != null){
            return ResponseEntity.status(HttpStatus.OK)
                .body(beneficiaryDTO);
        }
        return ResponseEntity.status(HttpStatus.OK)
        .body(null);
    }

    @Override
    @GetMapping("/get-all-beneficiary")
    public ResponseEntity<List<BenefitDTO>> 
        getAllBenefit() {
        
        List<BenefitDTO>  beneficiaryDTOList 
            = beneficiaryServiceImpl.getAllBenefitList();
        

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(beneficiaryDTOList);
    }

    
    
    

}


