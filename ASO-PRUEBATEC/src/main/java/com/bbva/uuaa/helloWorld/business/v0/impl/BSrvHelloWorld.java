package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import com.bbva.uuaa.helloWorld.business.v0.dto.BDtoIn;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {
	long number;

	@Override
	public BDtoOut process(BDtoIn bDtoIn) {
		BDtoOut response = new BDtoOut();
		BLimitAmount limitAmount = bDtoIn.getBdetails().getBLimitAmount();
		BMaximumAmount maximumAmount = new BMaximumAmount();
		BMinimumAmount minimumAmount = new BMinimumAmount();
		int amountInt = Integer.parseInt(limitAmount.getAmount());
		double maxamount = amountInt * 1.05;
		double minamount = amountInt * 0.9;
		String maxamountStr = String.valueOf(maxamount);
		String minamountStr = String.valueOf(minamount);
		Random random = new Random();
		number = (long) (random.nextDouble() * 1_000_000_000L);
		String id = String.format("%010d", number);
		response.setId(id);
		response.setNuip(bDtoIn.getNuip());
		maximumAmount.setAmount(maxamountStr);
		minimumAmount.setAmount(minamountStr);
		response.setBmaximumamount(maximumAmount);
		response.setBminimumamount(minimumAmount);
		response.setBdetails(bDtoIn.getBdetails());
		return response;
	}
}
