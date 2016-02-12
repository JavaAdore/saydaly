package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.437+0200")
@StaticMetamodel(Product.class)
public class Product_ {
	public static volatile SingularAttribute<Product, Long> id;
	public static volatile SingularAttribute<Product, String> productNameKey;
	public static volatile SingularAttribute<Product, String> productDiscriptionKey;
	public static volatile SingularAttribute<Product, Integer> needProspection;
	public static volatile SingularAttribute<Product, Double> estimatedPrice;
	public static volatile SingularAttribute<Product, ProudctType> productType;
	public static volatile SingularAttribute<Product, String> imagePathUrl;
	public static volatile SingularAttribute<Product, SystemUser> lastlyModifiedBy;
	public static volatile SingularAttribute<Product, Date> lastModificationDate;
	public static volatile SingularAttribute<Product, Lookup> status;
}
