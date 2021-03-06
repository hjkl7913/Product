package com.cos.fruit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cos.fruit.repository.ProductRepository;
import com.cos.fruit.util.Script;

public class ProductDeleteProcAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int itemId = Integer.parseInt(request.getParameter("itemId"));
		
		System.out.println("오냐?");
		ProductRepository productRepository = ProductRepository.getInstance();
		
		int result = productRepository.deleteById(itemId);
		
		Script.outText(result+"", response);
		
	}
}
