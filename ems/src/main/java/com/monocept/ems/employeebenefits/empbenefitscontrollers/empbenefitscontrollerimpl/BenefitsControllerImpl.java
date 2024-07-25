package com.monocept.ems.employeebenefits.empbenefitscontrollers.empbenefitscontrollerimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.impl.BenefitsServiceImpl;
import com.monocept.ems.employeebenefits.empbenefitscontrollers.BenefitsControllerInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;




@RestController
@RequestMapping("/benefits")
@CrossOrigin(origins = "*")
public class BenefitsControllerImpl 
    implements BenefitsControllerInterface{


    @Autowired
    BenefitsServiceImpl beneficiaryServiceImpl;


    @Override
    @GetMapping("/")
    public ResponseEntity<List<BenefitDTO>> 
        getBenefits() {
        
        List<BenefitDTO>  beneficiaryDTOList 
            = beneficiaryServiceImpl.getBenefits();
        

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(beneficiaryDTOList);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BenefitDTO> 
        getBenefitByID(@PathVariable String id) {
       
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

}


