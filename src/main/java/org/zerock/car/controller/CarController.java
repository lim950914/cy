package org.zerock.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/car/*")
@Log4j
public class CarController {

	@GetMapping("/list")
	public void carList() {
		log.info("carList method");
	}
}
