package com.api.customerloananalyzer.service;

import com.api.customerloananalyzer.controlller.dto.CustomerLoanRequest;
import com.api.customerloananalyzer.controlller.dto.CustomerLoanResponse;
import com.api.customerloananalyzer.controlller.dto.LoanResponse;
import com.api.customerloananalyzer.domain.Loan;
import com.api.customerloananalyzer.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoanService {
    public CustomerLoanResponse checkLoanAvailability(CustomerLoanRequest loanRequest){
        var costumer = loanRequest.toCustomer();
       var loan= new Loan(costumer);

       List<LoanResponse> loans= new ArrayList<>();
        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isConsignmentLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsigmentLoanInterestRate()));
        }

        if (loan.isGuaranteedLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }

        return new CustomerLoanResponse(loanRequest.name(), loans);
    }

}
