package V3.Menu;

import V3.menuitem.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderMenu {

    private List<Order> orderList = new ArrayList<>();

    public OrderMenu(){
        orderList.add(new Order("Orders"));
        orderList.add(new Order("Cancel"));
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
