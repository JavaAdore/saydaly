package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.435+0200")
@StaticMetamodel(PharmacyBranch.class)
public class PharmacyBranch_ {
	public static volatile SingularAttribute<PharmacyBranch, Long> id;
	public static volatile SingularAttribute<PharmacyBranch, Pharmacy> parmacy;
	public static volatile SingularAttribute<PharmacyBranch, PharmacyAddress> pharmcyAddress;
	public static volatile SingularAttribute<PharmacyBranch, String> workingDaysHoursNote;
	public static volatile SingularAttribute<PharmacyBranch, Integer> mainBranch;
	public static volatile SingularAttribute<PharmacyBranch, Lookup> status;
}
