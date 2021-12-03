package br.sicredi.springJpaAirbnb.controller;

import br.sicredi.springJpaAirbnb.models.Imovel;
import br.sicredi.springJpaAirbnb.models.data.TiposImovel;
import br.sicredi.springJpaAirbnb.dto.ImovelDto;
import br.sicredi.springJpaAirbnb.service.imovel.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {
    @Autowired
    ImovelService imovelService;

    @GetMapping
    public ResponseEntity<List<Imovel>> findAll(@RequestParam(required = false) TiposImovel tipo) {
        return new ResponseEntity<>(imovelService.findAll(tipo), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> cadastraImovel(@RequestBody ImovelDto imovelDto) {
        try {
            imovelService.save(imovelDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
