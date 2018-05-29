package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@RequestMapping("/")
	public String namaskar()
	{
		return "Namaskar";
	}
	@RequestMapping("/m")
	public Message getMessage()
	{
	Message message = new Message("Hello");
	return message;
	}
}