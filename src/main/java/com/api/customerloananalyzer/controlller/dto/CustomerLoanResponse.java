package com.api.customerloananalyzer.controlller.dto;

import java.util.List;

public record CustomerLoanResponse(String costumer, List<LoanResponse> loans) {
}
