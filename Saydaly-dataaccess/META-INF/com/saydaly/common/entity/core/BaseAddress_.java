package com.saydaly.common.entity.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:31:28.513+0200")
@StaticMetamodel(BaseAddress.class)
public class BaseAddress_ {
	public static volatile SingularAttribute<BaseAddress, Long> id;
	public static volatile SingularAttribute<BaseAddress, Country> country;
	public static volatile SingularAttribute<BaseAddress, String> city;
	public static volatile SingularAttribute<BaseAddress, String> district;
	public static volatile SingularAttribute<BaseAddress, String> streetName;
	public static volatile SingularAttribute<BaseAddress, String> buildingNumber;
	public static volatile SingularAttribute<BaseAddress, Double> latitude;
	public static volatile SingularAttribute<BaseAddress, Double> longitude;
}
