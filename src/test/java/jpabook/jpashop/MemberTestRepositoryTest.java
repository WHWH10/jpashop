package jpabook.jpashop;

import jpabook.jpashop.ex01.MemberRepository_Test;
import jpabook.jpashop.ex01.Member_Test;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTestRepositoryTest {

    @Autowired
    MemberRepository_Test memberRepositoryTest;

    @Test
    @Transactional
    public void testMember() throws Exception {
        //given
        Member_Test memberTest = new Member_Test();
        memberTest.setUsername("memberA");

        //when
        Long saveId = memberRepositoryTest.save(memberTest);
        Member_Test findMemberTest = memberRepositoryTest.find(saveId);

        //then
        Assertions.assertThat(findMemberTest.getId()).isEqualTo(memberTest.getId());
        Assertions.assertThat(findMemberTest.getUsername()).isEqualTo(memberTest.getUsername());
        Assertions.assertThat(findMemberTest).isEqualTo(memberTest);
    }
}