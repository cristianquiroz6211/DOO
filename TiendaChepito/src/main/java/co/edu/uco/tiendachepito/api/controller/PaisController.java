package co.edu.uco.tiendachepito.api.controller;

import co.edu.uco.tiendachepito.dto.PaisDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/paises")
public class PaisController {

    @GetMapping
    public List<PaisDTO> listar(){
        Pa
    }

}
