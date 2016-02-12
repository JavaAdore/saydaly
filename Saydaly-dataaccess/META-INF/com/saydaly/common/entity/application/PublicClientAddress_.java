package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.BaseAddress_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:31:28.482+0200")
@StaticMetamodel(PublicClientAddress.class)
public class PublicClientAddress_ extends BaseAddress_ {
	public static volatile SingularAttribute<PublicClientAddress, Integer> floorNumber;
	public static volatile SingularAttribute<PublicClientAddress, String> appartmentNumber;
	public static volatile SingularAttribute<PublicClientAddress, PublicClient> publicClient;
}
