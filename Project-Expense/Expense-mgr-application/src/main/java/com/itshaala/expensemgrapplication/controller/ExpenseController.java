package com.itshaala.expensemgrapplication.controller;

import com.itshaala.expensemgrapp.service.ExpenseService;
import com.itshaala.expensemgrapplication.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@AllArgsConstructor
public class ExpenseController {

    private ExpenseService expenseService;

    @PostMapping
    public <Expense> ResponseEntity<String> createExpense(@RequestBody Expense expense) {
        expenseService.createExpense((com.itshaala.expensemgrapplication.model.Expense) expense);
        return new ResponseEntity("expense created successfully", HttpStatus.CREATED);
    }

    @PutMapping
    public <Expense> ResponseEntity<String> updateExpense(@RequestBody Expense expense) {
        expenseService.updateExpense(expense);
        return new ResponseEntity("expense updated successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public <Expense> List<Expense> getAllExpenses() {
        return (List<Expense>) expenseService.getAllExpenses();
    }

    @GetMapping("/{id}")
    public <Expense> Expense getExpenseById(@PathVariable int id) {
        return (Expense) expenseService.getExpensesById(id);
    }

    @GetMapping("/filter")
    public <Expense> List<Expense> getExpensesByFilter(@RequestParam("name") String name, @RequestParam("desc") String desc) {
        com.itshaala.expensemgrapplication.model.Expense expense;
        Expense = expense.builder().expenseName(name).expenseDescription(desc).build();
        return (List<Expense>) expenseService.getExpensesByFilter(expense);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExpenseById(@PathVariable int id) {
        expenseService.deleteExpenseById(id);
        return new ResponseEntity<>("Expense deleted", HttpStatus.OK);
    }

}
