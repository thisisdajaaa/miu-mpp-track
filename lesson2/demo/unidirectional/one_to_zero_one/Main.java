package lesson2.demo.unidirectional.one_to_zero_one;

import lesson2.demo.unidirectional.one_to_zero_one.models.Customer;
import lesson2.demo.unidirectional.one_to_zero_one.models.Item;
import lesson2.demo.unidirectional.one_to_zero_one.models.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Da");
        ShoppingCart cart =  ShoppingCart.addNewShoppingCart(customer);
        cart.addItem(new Item("GG"));


        System.out.println(customer);
    }
}
