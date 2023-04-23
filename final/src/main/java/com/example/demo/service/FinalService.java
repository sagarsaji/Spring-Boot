package com.example.demo.service;

import com.example.demo.entity.Final;
import com.example.demo.repository.FinalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinalService {

    @Autowired
    public FinalRepo repo;

    public List<Final> getDistrictsBystate(String State) {

        return repo.findByState(State);

    }
}
