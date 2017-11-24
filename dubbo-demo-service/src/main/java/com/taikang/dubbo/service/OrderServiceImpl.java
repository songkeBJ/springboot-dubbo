package com.taikang.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.taikang.dubbo.goods.OrderService;
//@org.springframework.stereotype.Service
@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public String createOrder() {
		return "创建订单成功";
	}

}
