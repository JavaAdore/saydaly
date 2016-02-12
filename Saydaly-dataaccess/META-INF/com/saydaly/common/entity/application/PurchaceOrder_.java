package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.444+0200")
@StaticMetamodel(PurchaceOrder.class)
public class PurchaceOrder_ {
	public static volatile SingularAttribute<PurchaceOrder, Long> id;
	public static volatile SingularAttribute<PurchaceOrder, Double> estimatedTotalPrice;
	public static volatile SingularAttribute<PurchaceOrder, PublicClient> purchaceOrderInitiator;
	public static volatile SingularAttribute<PurchaceOrder, String> fullUserName;
	public static volatile SingularAttribute<PurchaceOrder, String> countryName;
	public static volatile SingularAttribute<PurchaceOrder, String> city;
	public static volatile SingularAttribute<PurchaceOrder, String> district;
	public static volatile SingularAttribute<PurchaceOrder, String> streetName;
	public static volatile SingularAttribute<PurchaceOrder, String> buildingNumber;
	public static volatile SingularAttribute<PurchaceOrder, Double> latitude;
	public static volatile SingularAttribute<PurchaceOrder, Double> longitude;
	public static volatile SingularAttribute<PurchaceOrder, Integer> floorNumber;
	public static volatile SingularAttribute<PurchaceOrder, String> appartmentNumber;
	public static volatile SingularAttribute<PurchaceOrder, String> orderNote;
	public static volatile SingularAttribute<PurchaceOrder, Date> orderDate;
	public static volatile SingularAttribute<PurchaceOrder, Lookup> orderStatus;
	public static volatile SingularAttribute<PurchaceOrder, Pharmacy> acceptedByPharmacy;
	public static volatile SingularAttribute<PurchaceOrder, Date> acceptanceDate;
	public static volatile SingularAttribute<PurchaceOrder, Lookup> orderLastStatus;
}
