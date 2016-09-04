package co.shinetech.megaball.dto;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Games.class)
public abstract class Games_ {

	public static volatile SingularAttribute<Games, String> code;
	public static volatile SingularAttribute<Games, Date> createdStamp;
	public static volatile SingularAttribute<Games, Integer> numbers;
	public static volatile SingularAttribute<Games, String> description;
	public static volatile SingularAttribute<Games, Integer> id;
	public static volatile CollectionAttribute<Games, Results> resultsCollection;
	public static volatile SingularAttribute<Games, Integer> extraNumbers;
	public static volatile SingularAttribute<Games, Integer> lastNumber;
	public static volatile SingularAttribute<Games, Date> deletedStamp;

}

