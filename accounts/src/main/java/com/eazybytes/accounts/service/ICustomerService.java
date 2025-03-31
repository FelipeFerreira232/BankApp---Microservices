package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {
    /**
     * @param mobileNumber - String
     * @return CustomerDetailsDto object
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
