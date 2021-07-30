package spring.core.discount;

import org.springframework.stereotype.Component;
import spring.core.member.Grade;
import spring.core.member.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmmount;
        } else {
            return 0;
        }
    }
}
