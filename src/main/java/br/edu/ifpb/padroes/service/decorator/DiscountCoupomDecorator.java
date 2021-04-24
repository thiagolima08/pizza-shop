package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCoupomDecorator extends BasePizzaDecorator {
    public DiscountCoupomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 0.25f;
    }
}
