package com.saydaly.common.entity.application;

import com.saydaly.common.entity.core.Lookup;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-02-02T18:29:57.429+0200")
@StaticMetamodel(ApplicationFeedbackRate.class)
public class ApplicationFeedbackRate_ {
	public static volatile SingularAttribute<ApplicationFeedbackRate, Long> id;
	public static volatile SingularAttribute<ApplicationFeedbackRate, PublicClient> publicClient;
	public static volatile SingularAttribute<ApplicationFeedbackRate, String> feedback;
	public static volatile SingularAttribute<ApplicationFeedbackRate, Lookup> channel;
	public static volatile SingularAttribute<ApplicationFeedbackRate, Date> feedbackDate;
	public static volatile SingularAttribute<ApplicationFeedbackRate, String> version;
	public static volatile SingularAttribute<ApplicationFeedbackRate, Integer> stars;
}
