package com.itshaala.expensemgrapp.dao;

import com.itshaala.expensemgrapp.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ExpenseDao extends JpaRepository<Expense, Integer> {

    List<Expense> findByExpenseNameContainingOrExpenseDescriptionContaining(String expenseName, String expenseDescription);

}