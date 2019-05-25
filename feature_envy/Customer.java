package com.directi.training.codesmells.featureenvy;

public class Customer
{
    private String _name;
    private Address _currentAddress;

    public Customer(String name, Address address)
    {
        _name = name;
        _currentAddress = address;
    }

    public void printAddress()
    {
        _currentAddress.print_all();
    }

    //other methods related to customer class.....

}
