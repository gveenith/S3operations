package com.example.aws.s3operations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
@RestController
@RequestMapping("/Hello")
public class S3CreateBucket {
	
	//with default client : Default region provider chain used when no explicit region is supplied to a client builder.

	
	AmazonS3 S3Client = AmazonS3ClientBuilder.standard()
						 .withRegion(Regions.US_EAST_1)
						 .build();
	
						 

	
	
	

}
