package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import com.saydaly.common.entity.core.SystemUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.431+0200")
@StaticMetamodel(Category.class)
public class Category_ {
	public static volatile SingularAttribute<Category, Long> id;
	public static volatile SingularAttribute<Category, String> categoryName;
	public static volatile SingularAttribute<Category, String> categoryDescription;
	public static volatile SingularAttribute<Category, String> imagePathUrl;
	public static volatile SingularAttribute<Category, SystemUser> createdBy;
	public static volatile SingularAttribute<Category, Date> creationDate;
	public static volatile SingularAttribute<Category, SystemUser> lastlyModifiedBy;
	public static volatile SingularAttribute<Category, Date> lastModificationDate;
	public static volatile SingularAttribute<Category, Lookup> status;
}
