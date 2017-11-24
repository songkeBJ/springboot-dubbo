package com.taikang.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taikang.dubbo.goods.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	//@Autowired
	@Reference
	private OrderService goodsService;
	
	@RequestMapping("/createOrder")
	public String addGoods(){
		
		return goodsService.createOrder();
		
	}
}
