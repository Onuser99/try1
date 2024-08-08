package com.itshaala.expensemgrapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseDao<Expense> extends JpaRepository<Expense, Integer> {

    <Expense> List<Expense> findByExpenseNameContainingOrExpenseDescriptionContaining(String expenseName, String expenseDescription);

}