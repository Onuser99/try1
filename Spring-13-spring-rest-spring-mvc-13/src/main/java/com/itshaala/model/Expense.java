package com.itshaala.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class Expense {
    private int id;
    private String description;
    private double amount;
    private LocalDate date;
}