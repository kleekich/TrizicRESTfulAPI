package com.kangsik.trizicRESTfulAPI.model;

import java.util.*;

import org.springframework.boot.CommandLineRunner;

/*
 	private String id;
    private String name;
    private String description;
    private int cashHoldingPercentage;
    private int driftPercentage;
    private String createdOn;
    private String modelType;
    private String rebalanceFrequency;
    private String advisorId;
    private List<AssetAllocation> assetAllocations;
 */

public class DbSeeder implements CommandLineRunner {
	@Override
	public void run(String... strings) throws Exception {
		List<AssetAllocation> assets = new ArrayList<>();
		

		
		Portfolio p1 = new Portfolio(
					"Portfolio example 1",
					"example model with tech stocks",
					null, 10,
					5,
					"2017-03-01",
					"TAXABLE",
					"QUARTERLY",
					null,
					Arrays.asList(
							new AssetAllocation("AAPL", 30),
							new AssetAllocation("GOOG", 20),
							new AssetAllocation("IBM", 15),
							new AssetAllocation("FB", 25)
					)
					
				);
				
	}
}
