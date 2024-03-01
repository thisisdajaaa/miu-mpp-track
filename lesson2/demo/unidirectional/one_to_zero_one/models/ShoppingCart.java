package lesson2.demo.unidirectional.one_to_zero_one.models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Integer id;
    private List<Item> itemList = new ArrayList<>();

    private ShoppingCart(Customer cust) {
        cust.setAccount(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public static ShoppingCart addNewShoppingCart(Customer customer) {
        if (customer == null) throw new NullPointerException("Null customer");

        return new ShoppingCart(customer);
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", itemList=" + itemList +
                '}';
    }
}
