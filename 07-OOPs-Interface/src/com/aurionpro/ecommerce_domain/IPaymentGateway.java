package com.aurionpro.ecommerce_domain;

public interface IPaymentGateway {

	void pay(Double amount);

	void refund();
}
