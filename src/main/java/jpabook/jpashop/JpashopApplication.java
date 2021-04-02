package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpashopApplication.class, args);
	}

}

// 계층형 구조 사용
// controller : 웹 계층
// service : 비즈니스 로직, 트랜잭션 처리
// repository : JPA를 직접 사용하는 계층, 엔티티 매니저 사용
// domain : 엔티티가 모여 있는 계층, 모든 계층에서 사용