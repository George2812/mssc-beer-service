package com.dialynas.msscbeerservice.web.mappers;

import com.dialynas.msscbeerservice.domain.Customer;
import com.dialynas.msscbeerservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
