package programingWithClasses.classesAndObjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private Customer[] customers = new Customer[2];
    private int moneysVolume;

    public Bank(){

    }


    public Bank(Customer[] customers, int moneysVolume) {
        this.customers = customers;
        this.moneysVolume = moneysVolume;
    }

    public void setCustomerList(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < customers.length; i++) {

            System.out.println("Enter id:");
            int id = scanner.nextInt();
            System.out.println("Enter FIO: ");
            String surname = scanner.next();
            String name = scanner.next();
            String patronymic = scanner.next();
            System.out.println("Enter address: ");
            String address = scanner.next();
            System.out.println("Enter credit card number: ");
            long cardNumber = scanner.nextLong();
            System.out.println("Enter bank account number: ");
            String bankAccountNumber = scanner.next();

            Customer customer = new Customer(id, surname, name, patronymic, address, cardNumber, bankAccountNumber);
            customers[i] = customer;
        }
    }


    public void findCustomersByCreditCardNumber(long from, long to){
        for (Customer customer: customers) {
            if(customer.getCardNumber() > from && customer.getCardNumber() < to){
                System.out.println(customer.toString());
            }
        }

    }
    public void printCustomerList(){
        for (Customer customer: customers) {
            System.out.println(customer.toString());
            System.out.println("\n");
        }

    }


    public void sortCustomerByName(){
        Comparator<Customer> bySurname = Comparator.comparing(Customer :: getSurname);
        Comparator<Customer> byName = Comparator.comparing(Customer :: getName);
        Comparator<Customer> byPatronymic = Comparator.comparing(Customer:: getPatronymic);

        Arrays.sort(customers, bySurname.thenComparing(byName.thenComparing(byPatronymic)));

        printCustomerList();
    }


    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getMoneysVolume() {
        return moneysVolume;
    }

    public void setMoneysVolume(int moneysVolume) {
        this.moneysVolume = moneysVolume;
    }
}
