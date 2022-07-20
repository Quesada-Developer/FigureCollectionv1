package com.quesada.figures.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FigureDTO {
    private final String name;
    private final Date date;
    private final Double price;
}