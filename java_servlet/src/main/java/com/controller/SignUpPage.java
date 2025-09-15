package com.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface SignUpPage {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
