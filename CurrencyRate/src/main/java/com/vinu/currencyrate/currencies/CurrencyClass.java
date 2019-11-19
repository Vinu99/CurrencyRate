package com.vinu.currencyrate.currencies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyClass {

	@RequestMapping("/getCurrency")
	public String getCurrency() {
		return "INR";
	}
}
