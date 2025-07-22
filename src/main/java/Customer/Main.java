package Customer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LineItem lineItem1 = new LineItem(1001, "Item 1", new Date(2010, 07, 01));
        LineItem lineItem2 = new LineItem(1002, "Item 2", new Date(2020, 07, 01));
        LineItem lineItem3 = new LineItem(1003, "Item 3", new Date(2030, 07, 01));
        LineItem lineItem4 = new LineItem(1004, "Item 4", new Date(2040, 07, 01));
        LineItem lineItem5 = new LineItem(1005, "Item 5", new Date(2050, 07, 01));

        List<LineItem> lineItemsList1 = new ArrayList<>();
        lineItemsList1.add(lineItem1);
        lineItemsList1.add(lineItem2);
        lineItemsList1.add(lineItem3);
        lineItemsList1.add(lineItem4);
        lineItemsList1.add(lineItem5);
        Customer customer1 = new Customer(100, "Customer 1", true, "M", lineItemsList1);

        LineItem lineItem6 = new LineItem(2001, "Item 6", new Date(2010, 07, 01));
        LineItem lineItem7 = new LineItem(2002, "Item 7", new Date(2020, 07, 01));

        List<LineItem> lineItemsList2 = new ArrayList<>();
        lineItemsList2.add(lineItem6);
        lineItemsList2.add(lineItem7);

        Customer customer2 = new Customer(200, "Customer 2", true, "F", lineItemsList2);

        LineItem lineItem8 = new LineItem(2003, "Item 8", new Date(2040, 07, 01));
        LineItem lineItem9 = new LineItem(3004, "Item 9", new Date(2070, 07, 01));
        LineItem lineItem10 = new LineItem(3005, "Item 10", new Date(2200, 07, 01));

        List<LineItem> lineItemsList3 = new ArrayList<>();
        lineItemsList3.add(lineItem8);
        lineItemsList3.add(lineItem9);
        lineItemsList3.add(lineItem10);

        Customer customer3 = new Customer(300, "Customer 3", true, "M", lineItemsList3);

        Customer customer4 = new Customer(400, "Customer 4", true, "F", new ArrayList<LineItem>());

//        Adding all 4 countomers to List.

        List<Customer> customersList = new ArrayList<>();
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);
        Map<String, Set<LineItem>> itemsByGender = customersList.stream()
                .collect(Collectors.groupingBy(
                        (Customer c) -> c.getGender(),
                        Collectors.flatMapping(
                                customer -> customer.getLineItems().stream(),
                                Collectors.toSet()
                        )
                ));

        System.out.println(itemsByGender);
    }

}
