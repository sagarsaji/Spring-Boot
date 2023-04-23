package com.example.demo.controller;

import com.example.demo.entity.Final;
import com.example.demo.service.FinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/district")
public class FinalController {

    @Autowired
    public FinalService service;
    @GetMapping("/{state}")
    public List<Final> getDistrictsBystate(@PathVariable String state){
        return service.getDistrictsBystate(state);
    }

}
