package spring.core.discount;

import spring.core.member.Grade;
import spring.core.member.Member;

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
