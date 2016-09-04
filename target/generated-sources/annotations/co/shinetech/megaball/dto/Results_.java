package co.shinetech.megaball.dto;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Results.class)
public abstract class Results_ {

	public static volatile SingularAttribute<Results, Date> date;
	public static volatile SingularAttribute<Results, String> termination;
	public static volatile SingularAttribute<Results, Games> gameId;
	public static volatile SingularAttribute<Results, String> numbersPairOdd;
	public static volatile SingularAttribute<Results, Date> createdStamp;
	public static volatile SingularAttribute<Results, String> numbers;
	public static volatile SingularAttribute<Results, String> stars;
	public static volatile SingularAttribute<Results, String> starsPairOdd;
	public static volatile SingularAttribute<Results, Date> deletedStamp;
	public static volatile SingularAttribute<Results, Integer> total;
	public static volatile SingularAttribute<Results, String> distanceNumbers;
	public static volatile SingularAttribute<Results, String> decimalStars;
	public static volatile SingularAttribute<Results, String> decimalNumbers;
	public static volatile SingularAttribute<Results, Integer> id;
	public static volatile SingularAttribute<Results, Integer> numYear;

}

