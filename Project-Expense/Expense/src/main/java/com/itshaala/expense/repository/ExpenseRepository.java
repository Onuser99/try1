package com.itshaala.expense.repository;

import com.itshaala.expense.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findAllByExpenseDateBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<Expense> findByExpenseDateAndTitleContainingIgnoreCaseOrAmountEquals(LocalDateTime expenseDate, String title, BigDecimal amount);

}
