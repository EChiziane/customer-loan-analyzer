package com.api.customerloananalyzer.controlller.dto;

import com.api.customerloananalyzer.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
