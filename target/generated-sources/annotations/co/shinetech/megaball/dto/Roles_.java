package co.shinetech.megaball.dto;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Roles.class)
public abstract class Roles_ {

	public static volatile SingularAttribute<Roles, String> roleCode;
	public static volatile SingularAttribute<Roles, Integer> id;
	public static volatile SingularAttribute<Roles, String> roleDescription;
	public static volatile CollectionAttribute<Roles, UsersRoles> usersRolesCollection;

}

