package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    // 모든연관관계는 지연로딩으로 설정한다
    // lazy 설정

    @Id @GeneratedValue
    @Column(name="member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") // 한 회원이 여러개의 주문이 가능함
    private List<Order> orders = new ArrayList<>();
}
