package edu.uao.project.backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uao.project.backend.Model.TutorsModel;
import edu.uao.project.backend.Service.ITutorsService;


@RestController
@RequestMapping("/tutor")
public class TutorsController {
    @Autowired
    ITutorsService tutorsService;

    @PostMapping("/")
    public ResponseEntity<String> crearTutor(@RequestBody TutorsModel tutor) {
        tutorsService.crearTutor(tutor);
        return new ResponseEntity<String>(tutorsService.crearTutor(tutor), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<TutorsModel>> listarTutores() {
        List<TutorsModel> tutores = tutorsService.listarTutores();
        return new ResponseEntity<>(tutores, HttpStatus.OK);
    }

    @GetMapping("/consulta2/{n}")
    public ResponseEntity<List<TutorsModel>> obtenerTutoresConCursosRatingMayorN(@PathVariable Float n) {
        List<TutorsModel> tutores = tutorsService.obtenerTutoresConCursosRatingMayorN(n);
        if (tutores.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tutores);
    }
    
}
