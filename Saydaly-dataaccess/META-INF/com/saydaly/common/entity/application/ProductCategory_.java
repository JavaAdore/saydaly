package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.437+0200")
@StaticMetamodel(ProductCategory.class)
public class ProductCategory_ {
	public static volatile SingularAttribute<ProductCategory, Long> id;
	public static volatile SingularAttribute<ProductCategory, Product> product;
	public static volatile SingularAttribute<ProductCategory, Category> category;
	public static volatile SingularAttribute<ProductCategory, SystemUser> lastlyModifiedBy;
	public static volatile SingularAttribute<ProductCategory, Date> lastModificationDate;
	public static volatile SingularAttribute<ProductCategory, Lookup> status;
}
