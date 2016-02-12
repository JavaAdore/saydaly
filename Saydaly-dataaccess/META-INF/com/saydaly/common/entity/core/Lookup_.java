package com.saydaly.common.entity.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T15:35:20.351+0200")
@StaticMetamodel(Lookup.class)
public class Lookup_ {
	public static volatile SingularAttribute<Lookup, Long> id;
	public static volatile SingularAttribute<Lookup, String> lookupName;
	public static volatile SingularAttribute<Lookup, String> lookupDescription;
	public static volatile SingularAttribute<Lookup, LookupCategory> category;
}
