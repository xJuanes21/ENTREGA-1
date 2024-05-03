package edu.uao.project.backend.Service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import edu.uao.project.backend.Model.TutorsModel;
import edu.uao.project.backend.Repository.ITutorsRepository;

@Service
public class TutorsServiceImp implements ITutorsService {

    @Autowired
    ITutorsRepository tutorsRepository;

    @Autowired
    IRattingService rattingService;

    @Override
    public String crearTutor(@RequestBody TutorsModel tutor) {
        this.tutorsRepository.save(tutor);
        return "El Tutor "+tutor.getNombre()+" fue creado exitosamente";
    }
    @Override
    public List<TutorsModel> listarTutores() {
        return this.tutorsRepository.findAll();
    }
    @Override
    public List<TutorsModel> obtenerTutoresConCursosRatingMayorN(Float n) {
        List<String> idsCursosRatingMayorN = rattingService.cursosRatingMayorN(n); // Obtener los IDs de cursos con rating mayor a N
        
        // Buscar tutores que tengan cursos con IDs en la lista obtenida
        List<TutorsModel> tutoresConCursosRatingMayorN = tutorsRepository.findAll().stream()
                .filter(tutor -> tutor.getCourses().stream()
                        .anyMatch(courseId -> idsCursosRatingMayorN.contains(courseId.get_id())))
                .collect(Collectors.toList());
    
        return tutoresConCursosRatingMayorN;
    }
    


}
    

