package edu.uao.project.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.uao.project.backend.Model.RattingModel;
import edu.uao.project.backend.Service.IRattingService;

@RestController
@RequestMapping("/ratting")
public class RattingController {
    @Autowired
    IRattingService rattingService;

    @PostMapping("/")
    public ResponseEntity<String> crearRatting(@RequestBody RattingModel ratting) {
        rattingService.crearRatting(ratting);
        return new ResponseEntity<String>(rattingService.crearRatting(ratting), HttpStatus.OK);
    }

    @GetMapping("/consulta1")
    public List<String> cursosRatingMayorN(@RequestParam Float n) {
        return rattingService.cursosRatingMayorN(n);
    }



    
}
