package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;
import br.edu.ifpb.padroes.service.decorator.DiscountCoupomDecorator;
import br.edu.ifpb.padroes.service.decorator.ExtraCheeseDecorator;
import br.edu.ifpb.padroes.service.decorator.StuffedCrustDecorator;

public class Main {

    public static void main(String[] args) {

        PizzaShopService pizzaShopService = new PizzaShopService();

        System.out.println("Pizzas - menu");

        // TODO - implementar adapter para juntar as pizzas da PizzaHot e Damenos em um único conjunto
        for (Pizza pizza : pizzaShopService.getPizzas()) {
            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
        }


        Pizza pizza = new PizzaShopPizza("pepperoni", 55.0f);

        // TODO - implementar padrão decorator para só precisar passar o objeto pizza
        Pizza extraCheese = new ExtraCheeseDecorator(pizza);
        Pizza stuffedCrust = new StuffedCrustDecorator(extraCheese);
        Pizza discountPizza = new DiscountCoupomDecorator(stuffedCrust);

        pizzaShopService.orderPizza(discountPizza);
    }

}
