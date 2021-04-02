package jpabook.jpashop.ex01;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository_Test {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member_Test memberTest) {
        em.persist(memberTest);
        return memberTest.getId();
    }

    public Member_Test find(Long id) {
        return em.find(Member_Test.class, id);
    }
}
