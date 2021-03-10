package com.project.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1")
public class WebfluxController {

	@GetMapping("/webflux")
	public Mono<String> getResult() {
		return Mono.defer(() -> Mono.just("Result is ready !!"))
				.delaySubscription(Duration.ofMillis(500));
	}
}
