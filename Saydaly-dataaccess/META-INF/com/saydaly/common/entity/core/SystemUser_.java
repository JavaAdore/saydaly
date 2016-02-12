package com.saydaly.common.entity.core;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T15:35:22.760+0200")
@StaticMetamodel(SystemUser.class)
public class SystemUser_ {
	public static volatile SingularAttribute<SystemUser, Long> id;
	public static volatile SingularAttribute<SystemUser, String> email;
	public static volatile SingularAttribute<SystemUser, String> password;
	public static volatile SingularAttribute<SystemUser, Role> role;
	public static volatile SingularAttribute<SystemUser, Date> passwordExpriyDate;
	public static volatile SingularAttribute<SystemUser, Lookup> status;
	public static volatile SingularAttribute<SystemUser, Country> country;
}
