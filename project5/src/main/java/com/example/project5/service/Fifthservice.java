package com.example.project5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Query.model.Fifth;

import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Service
@Transactional

public class Fifthservice {

    public List<Query> getTableDatas() {
        return null;
    }

    public List<Fifth> getDetail(Boolean activeState, List<String> descriptionList) {
        return null;
    }

    public int updateDatas(Boolean activeState, List<Long> idList) {
        return 0;
    }

}
