package com.bbva.uuaa.helloWorld.facade.v0.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseCreated;
import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.ISrvHelloWorld;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoIn;
import com.bbva.uuaa.helloWorld.facade.v0.dto.DtoOut;
import com.bbva.uuaa.helloWorld.facade.v0.mapper.ISrvHelloWorldMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import javax.validation.Valid;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Service
@SN (registryID = "SNGG20240069", logicalID = "helloWorld")
@VN (vnn = "v0")
@Path("/v0")
public class SrvHelloWorld implements ISrvHelloWorld {
	@Autowired
	private IBSrvHelloWorld bSrvHelloWorld;
	@Autowired
	private ISrvHelloWorldMapper mapper;

	@Override
	@POST
	@Path("/simulations/{nuip}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@SMC(registryID = "SMGG20240679", logicalID = "simulations")
	public ServiceResponseCreated<DtoOut> execute(@Valid DtoIn dtoIn, @PathParam("nuip") String nuip) {

		dtoIn.setNuip(nuip);
		BDtoIn bDtoIn = mapper.toBCreateDataIn(dtoIn);
		BDtoOut bDtoOut = bSrvHelloWorld.process(bDtoIn);
		DtoOut dtoOut = mapper.toCreateDataOut(bDtoOut);
		return ServiceResponseCreated.data(dtoOut).build();

	}
}
