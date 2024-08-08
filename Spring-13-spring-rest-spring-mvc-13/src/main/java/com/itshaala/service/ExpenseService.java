package com.itshaala.service;

import com.itshaala.dao.ExpenseDao;
import com.itshaala.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {
    ExpenseDao expenseDao;

    public List<Expense> getAllExpenses() {
        return expenseDao.findAllExpenses();
    }

    public Expense getExpenseById(int id) {
        return expenseDao.findExpenseById(id);
    }

    public void addExpense(Expense expense) {
        expenseDao.addExpense(expense);
    }

    public void updateExpense(Expense expense) {
        expenseDao.updateExpense(expense);
    }

    public void deleteExpense(int id) {
        expenseDao.deleteExpense(id);
    }
}