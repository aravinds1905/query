package com.example.Query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Query.model.Fifth;
import com.example.project5.service.Fifthservice;

import jakarta.persistence.Query;

@RestController
@RequestMapping("/api")

public class Fifthcontroller {

    @Autowired
    Fifthservice fifthservice;

    @GetMapping("/show_all")
    public List<Query> getDetails() {
        return fifthservice.getTableDatas();
    }

    @GetMapping("/show_data")
    public List<Query> getDetail() {
        return fifthservice.getTableDatas();
    }

    @GetMapping("/show_data/{activeState}/{descriptionList}")
    public List<Fifth> getData(@PathVariable Boolean activeState, @PathVariable List<String> descriptionList) {
        return fifthservice.getDetail(activeState, descriptionList);
    }

    @PutMapping("/updateData/{activeState}/{idList}")
    public int updateData(@PathVariable Boolean activeState, @PathVariable List<Long> idList) {
        return fifthservice.updateDatas(activeState, idList);
    }

}
