package com.saydaly.common.entity.core;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T16:35:18.707+0200")
@StaticMetamodel(Language.class)
public class Language_ {
	public static volatile SingularAttribute<Language, Long> id;
	public static volatile SingularAttribute<Language, String> languageAbbreviation;
	public static volatile SingularAttribute<Language, String> languageName;
	public static volatile SingularAttribute<Language, Lookup> languageStatus;
	public static volatile SingularAttribute<Language, String> language_image_url;
}
