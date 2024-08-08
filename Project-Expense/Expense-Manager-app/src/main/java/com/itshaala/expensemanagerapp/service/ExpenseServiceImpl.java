package com.example.expensemanager.service;

import com.example.expensemanager.model.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);
    Expense addExpense(Expense expense);
    Expense updateExpense(Long id, Expense expense);
    void deleteExpense(Long id);
    List<Expense> searchExpenses(String keyword);
    // Add more methods as per requirements
}


package com.itshaala.expensemanagerapp.service;

import com.itshaala.expensemanagerapp.service.model.Expense;
import com.itshaala.expensemanagerapp.repository.ExpensemanagerRepository;
import com.example.expensemanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense updateExpense(Long id, Expense expense) {
        if (expenseRepository.existsById(id)) {
            expense.setId(id);
            return expenseRepository.save(expense);
        }
        return null;
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

    @Override
    public List<Expense> searchExpenses(String keyword) {
        // Implement search logic based on date, time, title, amount
        return null;
    }
}
