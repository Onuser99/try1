package com.itshaala.controller;

import com.itshaala.model.Expense;
import com.itshaala.service.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExpenseController {
    ExpenseService expenseService;

    @RequestMapping(value = "/expenses", method = RequestMethod.GET, consumes = "application/json")
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @RequestMapping(value = "/expenses/{id}", method = RequestMethod.GET, consumes = "application/json")
    public Expense getExpenseById(@PathVariable("id") int id) {
        return expenseService.getExpenseById(id);
    }

    @RequestMapping(value = "/expenses", method = RequestMethod.POST, consumes = "application/json")
    public void addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
    }

    @RequestMapping(value = "/expenses", method = RequestMethod.PUT, consumes = "application/json")
    public void updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
    }

    @RequestMapping(value = "/expenses/{id}", method = RequestMethod.DELETE, consumes = "application/json")
    public void deleteExpense(@PathVariable("id") int id) {
        expenseService.deleteExpense(id);
    }
}