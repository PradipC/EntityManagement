package com.entity.management.controller;

import com.entity.management.Service.SourceService;
import com.entity.management.model.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entity/source")
public class SourceController {

    @Autowired
    private SourceService sourceService;


    @PostMapping("/create")
    public ResponseEntity<Source> createSourceEntity(@RequestBody Source sourceEntity) {
        Source newSource = sourceService.createSourceEntity(sourceEntity);
        return new ResponseEntity<>(newSource, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateSourceEntity(@PathVariable String id, @RequestBody Source updatedSourceEntity) {
        Source updatedSource = sourceService.updateSourceEntity(id, updatedSourceEntity);
        return new ResponseEntity<>(updatedSource, HttpStatus.OK);
    }


}
