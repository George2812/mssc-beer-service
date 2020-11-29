package com.dialynas.msscbeerservice.web.mappers;

import com.dialynas.msscbeerservice.domain.Beer;
import com.dialynas.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
