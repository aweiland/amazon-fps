/******************************************************************************* 
 *  Copyright 2008-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *    __  _    _  ___ 
 *   (  )( \/\/ )/ __)
 *   /__\ \    / \__ \
 *  (_)(_) \/\/  (___/
 * 
 *  Amazon FPS Java Library
 *  API Version: 2010-08-28
 *  Generated: Mon May 30 08:09:49 GMT+00:00 2011 
 * 
 */



package com.amazonaws.fps.samples;

import java.util.List;
import java.util.ArrayList;
import com.amazonaws.fps.*;
import com.amazonaws.fps.model.*;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import com.amazonaws.utils.*;

/**
 *
 * Pay  Samples
 *
 *
 */
public class PayAsyncSample {

    /**
     * Just add few required parameters, and try the service
     * Pay functionality
     *
     * @param args unused
     */
    public static void main(String... args) {
        
        /************************************************************************
         * Access Key ID and Secret Acess Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/

         String accessKeyId = PropertyBundle.getProperty(PropertyKeys.AWS_ACCESS_KEY);
         String secretAccessKey = PropertyBundle.getProperty(PropertyKeys.AWS_SECRET_KEY);

         /************************************************************************

         * 
         * Important! Number of threads in executor should match number of connections
         * for http client.
         *
         ***********************************************************************/

         AmazonFPSConfig config = new AmazonFPSConfig().withMaxConnections (100);
         ExecutorService executor = Executors.newFixedThreadPool(100);

         AmazonFPSAsync service = null;
 		try {
 			service = new AmazonFPSAsyncClient(accessKeyId, secretAccessKey, config, executor);
 	         
 		} catch (AmazonFPSException e) {
 			 System.out.println("Caught Exception: " + e.getMessage());
 	   	        System.out.println("Response Status Code: " + e.getStatusCode());
 	   	        System.out.println("Error Code: " + e.getErrorCode());
 	   	        System.out.println("Error Type: " + e.getErrorType());
 	   	        System.out.println("Request ID: " + e.getRequestId());
 	   	        System.out.print("XML: " + e.getXML());
 		}
        /************************************************************************
         * Setup requests parameters and invoke parallel processing. Of course
         * in real world application, there will be much more than a couple of
         * requests to process.
         ***********************************************************************/
         PayRequest requestOne = new PayRequest();
         // @TODO: set request parameters here

         PayRequest requestTwo = new PayRequest();
         // @TODO: set second request parameters here

         List<PayRequest> requests = new ArrayList<PayRequest>();
         requests.add(requestOne);
         requests.add(requestTwo);

         invokePay(service, requests);

         executor.shutdown();

    }


                                                                                                    
    /**
     * Pay request sample
     * 
     * Allows calling applications to move money from a sender to a recipient.
     *   
     * @param service instance of AmazonFPS service
     * @param requests list of requests to process
     */
    public static void invokePay(AmazonFPSAsync service, List<PayRequest> requests) {
        List<Future<PayResponse>> responses = new ArrayList<Future<PayResponse>>();
        for (PayRequest request : requests) {
            responses.add(service.payAsync(request));
        }
        for (Future<PayResponse> future : responses) {
            while (!future.isDone()) {
                Thread.yield();
            }
            try {
                PayResponse response = future.get();
                // Original request corresponding to this response, if needed:
                PayRequest originalRequest = requests.get(responses.indexOf(future));
                System.out.println("Response request id: " + response.getResponseMetadata().getRequestId());
            } catch (Exception e) {
                if (e.getCause() instanceof AmazonFPSException) {
                    AmazonFPSException exception = AmazonFPSException.class.cast(e.getCause());
                    System.out.println("Caught Exception: " + exception.getMessage());
                    System.out.println("Response Status Code: " + exception.getStatusCode());
                    System.out.println("Error Code: " + exception.getErrorCode());
                    System.out.println("Error Type: " + exception.getErrorType());
                    System.out.println("Request ID: " + exception.getRequestId());
                    System.out.print("XML: " + exception.getXML());
                } else {
                    e.printStackTrace();
                }
            }
        }
    }
                                
}
