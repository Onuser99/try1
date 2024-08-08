package com.itshaala.dao;

import com.itshaala.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class ExpenseDao {
    static List<Expense> expenses = new ArrayList<>();

    //crud
    public List<Expense> findAllExpenses() {
        return expenses;
    }

    public Expense findExpenseById(int id) {
        return expenses.stream().filter(expense -> expense.getId() == id)
                .findFirst().orElse(null);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void updateExpense(Expense expense) {
        expenses.set(expenses.indexOf(expense), expense);
    }

    public void deleteExpense(int id) {
        expenses.removeIf(expense -> expense.getId() == id);
    }
}