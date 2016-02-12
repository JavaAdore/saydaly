package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.439+0200")
@StaticMetamodel(ProductUnit.class)
public class ProductUnit_ {
	public static volatile SingularAttribute<ProductUnit, Long> id;
	public static volatile SingularAttribute<ProductUnit, String> productUnitName;
	public static volatile SingularAttribute<ProductUnit, String> productUnitDescription;
	public static volatile SingularAttribute<ProductUnit, SystemUser> lastlyModifiedBy;
	public static volatile SingularAttribute<ProductUnit, Date> lastModificationDate;
	public static volatile SingularAttribute<ProductUnit, Lookup> status;
}
