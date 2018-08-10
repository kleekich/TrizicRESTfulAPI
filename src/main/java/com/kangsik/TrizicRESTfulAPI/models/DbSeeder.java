package com.kangsik.TrizicRESTfulAPI.models;

import java.util.*;
import org.springframework.stereotype.Component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.annotation.Id;

/*
 	@Id
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
@Component
public class DbSeeder implements CommandLineRunner {
	@Override
	public void run(String... strings) throws Exception {
		Portfolio p1 = new Portfolio(

						"Portfolio example 1",//name
						"example model with tech stocks",//desc
						10,//cP
						5,//dP
						"2017-03-01",//CreatedOn
						"TAXABLE",//modelTye
						"QUARTERLY",//rebalance
						"ADVISORID REQUIRED", Arrays.asList(
								new AssetAllocation("AAPL", 30),
								new AssetAllocation("GOOG", 20),
								new AssetAllocation("IBM", 15),
								new AssetAllocation("FB", 25)
						)
					);
				
	}
}
