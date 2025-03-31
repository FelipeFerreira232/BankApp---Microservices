package com.eazybytes.loans.service;


import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {
    /**
     * Create a loan
     * @param mobileNumber
     */
    void createLoan(String mobileNumber);


    /**
     * Fetch loans
     * @param mobileNumber
     * @return
     */
    LoansDto fetchLoans(String mobileNumber);


    /**
     * Update loans
     * @param loansDto
     * @return
     */
    boolean updateLoansDto(LoansDto loansDto);


    /**
     * Delete loans
     * @param mobileNumber
     * @return
     */
    boolean deleteLoans(String mobileNumber);
}
