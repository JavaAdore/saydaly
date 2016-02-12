package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.433+0200")
@StaticMetamodel(OrderNotification.class)
public class OrderNotification_ {
	public static volatile SingularAttribute<OrderNotification, Long> id;
	public static volatile SingularAttribute<OrderNotification, PurchaceOrder> purchaceOrder;
	public static volatile SingularAttribute<OrderNotification, PharmacyBranch> pharmacyBranch;
	public static volatile SingularAttribute<OrderNotification, Lookup> status;
	public static volatile SingularAttribute<OrderNotification, Date> notificationDate;
	public static volatile SingularAttribute<OrderNotification, Date> acceptanceDate;
	public static volatile SingularAttribute<OrderNotification, SystemUser> acceptedBy;
}
