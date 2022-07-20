package com.quesada.figures.dao;

import com.quesada.figures.dto.FigureDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryDAO {
    private final List<FigureDTO> db = new ArrayList<>();

    public void insert(String name, Date date, Double price) {
        db.add(new FigureDTO(name, date, price));
    }

    public List<FigureDTO> getAll() {
        return new ArrayList<>(db);
    }
}