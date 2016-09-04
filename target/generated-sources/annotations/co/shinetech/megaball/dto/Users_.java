package co.shinetech.megaball.dto;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> password;
	public static volatile SingularAttribute<Users, Boolean> validated;
	public static volatile SingularAttribute<Users, Date> createdStamp;
	public static volatile SingularAttribute<Users, Integer> id;
	public static volatile SingularAttribute<Users, String> email;
	public static volatile SingularAttribute<Users, Date> deletedStamp;
	public static volatile CollectionAttribute<Users, UsersRoles> usersRolesCollection;
	public static volatile SingularAttribute<Users, String> username;

}

