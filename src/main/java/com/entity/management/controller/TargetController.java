package com.entity.management.controller;


import com.entity.management.Service.TargetService;
import com.entity.management.model.Target;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entity/target")
public class TargetController {


    @Autowired
    private TargetService targetService;


    @PostMapping("/create")
    public ResponseEntity<Target> createTargetEntity(@RequestBody Target targetEntity) {
        Target newTarget = targetService.createTargetEntity(targetEntity);
        return new ResponseEntity<>(newTarget, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Target> updateSourceEntity(@PathVariable String id, @RequestBody Target updatedTargetEntity) {
        Target updatedTarget = targetService.updateTargetEntity(id, updatedTargetEntity);
        return new ResponseEntity<>(updatedTarget, HttpStatus.OK);
    }


}
