package com.jtools.main;

import java.util.Scanner;

import com.jtools.service.InventoryMgmtService;

public class Run {
	public static void main(String[] args) {
		InventoryMgmtService inventoryMgmtService = new InventoryMgmtService();
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("product code:");
			String productCode = scanner.next();
			int availableUnits = inventoryMgmtService.getAvailableUnits(productCode);
			System.out.println("units available : " + availableUnits);
		}
	}
}
