package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.436+0200")
@StaticMetamodel(PharmacyPhoneNumber.class)
public class PharmacyPhoneNumber_ {
	public static volatile SingularAttribute<PharmacyPhoneNumber, Long> id;
	public static volatile SingularAttribute<PharmacyPhoneNumber, PharmacyBranch> pharmacyBranch;
	public static volatile SingularAttribute<PharmacyPhoneNumber, String> number;
	public static volatile SingularAttribute<PharmacyPhoneNumber, Integer> mobile;
	public static volatile SingularAttribute<PharmacyPhoneNumber, Lookup> status;
}
