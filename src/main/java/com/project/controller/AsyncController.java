package com.project.controller;

import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AsyncController {

	@Async
	@GetMapping("/async")
	public CompletableFuture<?> getAsyncResult(HttpServletRequest request) throws InterruptedException{
		Thread.sleep(1000);
		return CompletableFuture.completedFuture("Result is ready !!");
	}
}
