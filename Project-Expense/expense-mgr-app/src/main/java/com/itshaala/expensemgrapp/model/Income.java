
package com.itshaala.expensemgrapp.model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class Income {
    private int incomeId;
    private String incomeName;
    private LocalDateTime incomeDate;
    private double incomeAmount;
    private String incomeType;
    private String incomeNotes;
}
