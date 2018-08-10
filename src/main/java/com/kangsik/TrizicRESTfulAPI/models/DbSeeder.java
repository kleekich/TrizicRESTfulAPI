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
						"e0fe83a1-7512-432f-ba66-d2ae677272c1", Arrays.asList(
								new AssetAllocation("AAPL", 30),
								new AssetAllocation("GOOG", 20),
								new AssetAllocation("IBM", 15),
								new AssetAllocation("FB", 25)
						)
					);
		Portfolio p2 = new Portfolio(

				"Portfolio example 2",//name
				"example model with misc stocks",//desc
				5,//cP
				2,//dP
				"2017-03-02",//CreatedOn
				"TAXABLE",//modelTye
				"ANNUAL",//rebalance
				"549a368e-1671-4d84-8463-af2bc32f1dea", Arrays.asList(
						new AssetAllocation("COCK", 15),
						new AssetAllocation("PEP", 15),
						new AssetAllocation("CMG", 30),
						new AssetAllocation("MCD", 35)
				)
			);
				
	}
}
