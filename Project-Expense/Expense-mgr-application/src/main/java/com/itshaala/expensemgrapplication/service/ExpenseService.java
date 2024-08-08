package com.itshaala.expensemgrapp.service;

import com.itshaala.expensemgrapplication.dao.ExpenseDao;
import com.itshaala.expensemgrapplication.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExpenseService {

    ExpenseDao expenseDao;

    public void createExpense(Expense expense) {
        expenseDao.save(expense);
    }

    public List getAllExpenses() {
        return expenseDao.findAll();
    }

    public Expense getExpensesById(int id) {
        return (Expense) expenseDao.findById(id).get();
    }

    public void deleteExpenseById(int id) {
        expenseDao.deleteById(id);
    }

    public void updateExpense(Expense expense) {
        Expense toBeDeleted = expenseDao.findById(expense.getExpenseId()).get();
        expenseDao.delete(toBeDeleted);
        expenseDao.save(expense);
    }

    public List<Expense> getExpensesByFilter(Expense expense) {
        return expenseDao.findByExpenseNameContainingOrExpenseDescriptionContaining(expense.getExpenseName(),expense.getExpenseDescription());
    }
}