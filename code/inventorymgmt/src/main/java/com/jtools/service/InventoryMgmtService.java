package com.jtools.service;

import java.security.SecureRandom;

public class InventoryMgmtService {
	public int getAvailableUnits(String productCode) {
		return new SecureRandom().nextInt(10000);
	}
}
