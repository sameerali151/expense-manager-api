package com.learning.service;

import java.util.List;

import com.learning.domain.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	List<Expense> findByMonthAndYear(String month, int year);
	
	List<Expense> findByYear(int year);
	
	void saveOrUpdateExpense(Expense expense);
	
	void deleteExpense(String id);

}
