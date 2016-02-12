package com.saydaly.common.entity.application;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.445+0200")
@StaticMetamodel(PurchaceOrderImage.class)
public class PurchaceOrderImage_ {
	public static volatile SingularAttribute<PurchaceOrderImage, Long> id;
	public static volatile SingularAttribute<PurchaceOrderImage, PurchaceOrder> purchaseOrder;
	public static volatile SingularAttribute<PurchaceOrderImage, String> imagePathUrl;
}
