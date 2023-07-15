package exercise_mvc.repository;

import exercise_mvc.Model.Customer;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static Customer[] customerList;
    private static int size;

    static {
        customerList = new Customer[10];
        customerList[0] = new Customer(1, "Ronaldo", 34, "VIP");
        customerList[1] = new Customer(2, "Messi", 32, "VIP");
        customerList[2] = new Customer(3, "Trump", 60, "NORMAL");
        customerList[3] = new Customer(4, "Biden", 61, "STANDER");
        size = 4;
    }

    @Override
    public Customer[] findAll() {
        Customer[] customer = new Customer[size];
        for (int i = 0; i < size; i++) {
            customer[i] = customerList[i];
        }
        return customer;
    }

    @Override
    public void addCustomer(Customer customer) {
        if (size > customerList.length || size < 0) {
            throw new IndexOutOfBoundsException("No add");
        } else {
            customerList[size] = customer;
            size++;
        }

    }

    @Override
    public void deleteCustomer(int id) {
        for (int i = 0; i < customerList.length; i++) {
            if (id == customerList[i].getId()) {
                for (int j = i; j < size-1; j++) {
                    customerList[j] = customerList[j + 1];
                }
                customerList[size - 1] = null;
                size--;
                break;
            }
        }

    }

    @Override
    public void searchCustomer(String name) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (customerList[i].getName().contains(name)) {
                System.out.println("Name of customer: " + customerList[i].getName());
                flag = true;
                break;
            }
            if (flag){
                System.out.println("No found");
            }
        }
    }
}
