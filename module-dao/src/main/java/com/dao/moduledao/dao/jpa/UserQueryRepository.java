package com.dao.moduledao.dao.jpa;

import com.dao.moduledao.dao.UserRepository;
import com.dao.moduledao.dao.jpa.support.Querydsl4RepositorySupport;
import com.dao.moduledao.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import static com.dao.moduledao.entity.QUser.user;

@Repository
public class UserQueryRepository extends Querydsl4RepositorySupport implements UserRepository {

    private final JPAQueryFactory queryFactory;
    public UserQueryRepository(EntityManager em) {
        super(User.class);
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public User findById(Long id) {
        return selectFrom(user)
                .where(user.id.eq(id))
                .fetchOne();
    }
}
