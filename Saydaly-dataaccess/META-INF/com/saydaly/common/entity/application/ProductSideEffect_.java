package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.438+0200")
@StaticMetamodel(ProductSideEffect.class)
public class ProductSideEffect_ {
	public static volatile SingularAttribute<ProductSideEffect, Long> id;
	public static volatile SingularAttribute<ProductSideEffect, Product> product;
	public static volatile SingularAttribute<ProductSideEffect, String> sideEffectDescrptionKey;
	public static volatile SingularAttribute<ProductSideEffect, SystemUser> lastlyModifiedBy;
	public static volatile SingularAttribute<ProductSideEffect, Date> lastModificationDate;
	public static volatile SingularAttribute<ProductSideEffect, Lookup> status;
}
