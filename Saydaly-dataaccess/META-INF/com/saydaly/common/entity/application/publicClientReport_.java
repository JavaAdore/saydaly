package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.443+0200")
@StaticMetamodel(publicClientReport.class)
public class publicClientReport_ {
	public static volatile SingularAttribute<publicClientReport, Long> id;
	public static volatile SingularAttribute<publicClientReport, PublicClient> publicClient;
	public static volatile SingularAttribute<publicClientReport, PurchaceOrder> purchaceOrder;
	public static volatile SingularAttribute<publicClientReport, Date> reportDate;
	public static volatile SingularAttribute<publicClientReport, SystemUser> reportedBy;
}
