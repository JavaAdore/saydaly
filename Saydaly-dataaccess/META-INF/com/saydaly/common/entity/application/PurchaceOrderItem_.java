package com.saydaly.common.entity.application;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.446+0200")
@StaticMetamodel(PurchaceOrderItem.class)
public class PurchaceOrderItem_ {
	public static volatile SingularAttribute<PurchaceOrderItem, Long> id;
	public static volatile SingularAttribute<PurchaceOrderItem, Product> product;
	public static volatile SingularAttribute<PurchaceOrderItem, Integer> quantity;
	public static volatile SingularAttribute<PurchaceOrderItem, Double> estimatedPricePerUnit;
	public static volatile SingularAttribute<PurchaceOrderItem, Double> estimatedOrderItemPrice;
	public static volatile SingularAttribute<PurchaceOrderItem, PurchaceOrder> purchaceOrder;
}
