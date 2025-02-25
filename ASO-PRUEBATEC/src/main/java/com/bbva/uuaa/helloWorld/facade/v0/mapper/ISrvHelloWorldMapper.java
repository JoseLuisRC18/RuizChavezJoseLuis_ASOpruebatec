package com.bbva.uuaa.helloWorld.facade.v0.mapper;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDetails;
import com.bbva.uuaa.helloWorld.business.v0.dto.BLimitAmount;
import com.bbva.uuaa.helloWorld.business.v0.dto.BProduct;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Details;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.dto.LimitAmount;
import com.bbva.uuaa.helloWorld.facade.v0.dto.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ISrvHelloWorldMapper {
    @Mapping(target = "bdetails", source = "details")
    @Mapping(target = "nuip", source = "nuip")
    BDtoIn toBCreateDataIn(DtoIn dtoIn);

    @Mapping(target = "details.product", source = "bdetails.bproduct")
    @Mapping(target = "id", source = "id")
    @Mapping(target = "maximumamount", source = "bmaximumamount")
    @Mapping(target = "minimumamount", source = "bminimumamount")
    @Mapping(target = "details.limitAmount.amount", source = "bdetails.BLimitAmount.amount")
    @Mapping(target = "details.limitAmount.currency", source = "bdetails.BLimitAmount.currency")
    @Mapping(target = "details", source = "bdetails")
    @Mapping(target = "nuip", source = "nuip")
    DtoOut toCreateDataOut(BDtoOut bDtoOut);

    @Mapping(target = "offerType", source = "offerType")
    @Mapping(target = "BLimitAmount", source = "limitAmount")
    @Mapping(target = "bproduct", source = "product")
    BDetails toBDetails(Details details);

    @Mapping(target = "offerType", source = "offerType")
    @Mapping(target = "limitAmount", source = "BLimitAmount")
    @Mapping(target = "product", source = "bproduct")
    Details toDetails(BDetails bDetails);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "bsubproduct", source = "subproduct")
    BProduct toBProduct(Product product);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "subproduct", source = "bsubproduct")
    Product toProduct(BProduct bProduct);

    @Mapping(target = "amount", source = "amount")
    @Mapping(target = "currency", source = "currency")
    BLimitAmount toBLimitAmount(LimitAmount limitAmount);

    @Mapping(target = "amount", source = "amount")
    @Mapping(target = "currency", source = "currency")
    LimitAmount toLimitAmount(BLimitAmount bLimitAmount);


}
