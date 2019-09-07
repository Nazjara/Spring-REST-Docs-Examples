package com.nazjara.mappers;

import com.nazjara.dto.BeerDto;
import com.nazjara.model.Beer;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface  BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}