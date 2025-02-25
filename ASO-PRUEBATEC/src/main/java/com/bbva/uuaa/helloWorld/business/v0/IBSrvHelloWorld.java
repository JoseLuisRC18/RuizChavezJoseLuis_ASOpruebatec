package com.bbva.uuaa.helloWorld.business.v0;

import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoOut;

public interface IBSrvHelloWorld {
	BDtoOut process (BDtoIn bDtoIn);
}