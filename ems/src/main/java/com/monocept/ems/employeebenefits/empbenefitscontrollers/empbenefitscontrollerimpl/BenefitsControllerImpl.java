package com.monocept.ems.employeebenefits.empbenefitscontrollers.empbenefitscontrollerimpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.employeebenefits.empbeneficiaryservices.impl.BenefitsServiceImpl;
import com.monocept.ems.employeebenefits.empbenefitscontrollers.BenefitsControllerInterface;
import com.monocept.ems.employeebenefits.empbenefitsdtos.BenefitDTO;
import com.monocept.ems.employeebenefits.empbenefitsdtos.EmployeeRespectiveBenefitDTO;




@RestController
@RequestMapping("/benefits")
@CrossOrigin(origins = "*")
public class BenefitsControllerImpl 
    implements BenefitsControllerInterface{

    private static Logger logger = 
        Logger.getLogger(BenefitsControllerImpl.class.getName());

    @Autowired
    BenefitsServiceImpl benefitsServiceImpl;



    @Override
    @GetMapping("/")
    public ResponseEntity<List<BenefitDTO>> 
        getBenefits() {
        
        List<BenefitDTO>  beneficiaryDTOList 
            = benefitsServiceImpl.getBenefits();
        

        return ResponseEntity
            .status(HttpStatus.OK)
            .body(beneficiaryDTOList);
    }

    


    @Override
    @GetMapping("/employee")
    public ResponseEntity<List<EmployeeRespectiveBenefitDTO>> 
        getEmployeeRespectiveBenefit(@RequestParam String empId) {

        try{
           int id = Integer.parseInt(empId);
           
           List<EmployeeRespectiveBenefitDTO> resultList 
            =   benefitsServiceImpl
            .getEmployeeRespectiveBenfitList(id);
        
            
            return ResponseEntity
            .status(HttpStatus.OK)
            .body(resultList);


        }catch(Exception e){

            logger.warning("getEmpRespectiveBenefit() :: Exception : "+e);
            
        }
        
        
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(new ArrayList<>());
    }

}


