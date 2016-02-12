package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T16:23:42.950+0200")
@StaticMetamodel(PublicClient.class)
public class PublicClient_ {
	public static volatile SingularAttribute<PublicClient, Long> id;
	public static volatile SingularAttribute<PublicClient, String> fullName;
	public static volatile SingularAttribute<PublicClient, String> email;
	public static volatile SingularAttribute<PublicClient, String> phoneNumber;
	public static volatile SingularAttribute<PublicClient, Lookup> status;
	public static volatile SingularAttribute<PublicClient, String> gender;
	public static volatile SingularAttribute<PublicClient, String> password;
	public static volatile SingularAttribute<PublicClient, String> facebookUserId;
	public static volatile SingularAttribute<PublicClient, String> facebookAccessTaken;
	public static volatile SingularAttribute<PublicClient, String> saydaly_taken;
	public static volatile SingularAttribute<PublicClient, Date> birthday;
}
