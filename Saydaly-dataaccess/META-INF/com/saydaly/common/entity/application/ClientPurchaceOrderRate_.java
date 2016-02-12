package com.saydaly.common.entity.application;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.432+0200")
@StaticMetamodel(ClientPurchaceOrderRate.class)
public class ClientPurchaceOrderRate_ {
	public static volatile SingularAttribute<ClientPurchaceOrderRate, Long> id;
	public static volatile SingularAttribute<ClientPurchaceOrderRate, PublicClient> publicClient;
	public static volatile SingularAttribute<ClientPurchaceOrderRate, Date> feedbackDate;
	public static volatile SingularAttribute<ClientPurchaceOrderRate, Integer> stars;
	public static volatile SingularAttribute<ClientPurchaceOrderRate, PurchaceOrder> purchaceOrder;
	public static volatile SingularAttribute<ClientPurchaceOrderRate, PharmacyBranch> pharmacyBranch;
}
