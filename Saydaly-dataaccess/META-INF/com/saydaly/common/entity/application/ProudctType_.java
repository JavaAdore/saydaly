package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.439+0200")
@StaticMetamodel(ProudctType.class)
public class ProudctType_ {
	public static volatile SingularAttribute<ProudctType, Long> id;
	public static volatile SingularAttribute<ProudctType, String> productTypeNameKey;
	public static volatile SingularAttribute<ProudctType, ProductUnit> productUnit;
	public static volatile SingularAttribute<ProudctType, SystemUser> lastlyModifiedBy;
	public static volatile SingularAttribute<ProudctType, Date> lastModificationDate;
	public static volatile SingularAttribute<ProudctType, Lookup> status;
}
