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
import com.amazonaws.fps.mock.AmazonFPSMock;
import com.amazonaws.utils.*;

/**
 *
 * Get Total Prepaid Liability  Samples
 *
 *
 */
public class GetTotalPrepaidLiabilitySample {

    /**
     * Just add few required parameters, and try the service
     * Get Total Prepaid Liability functionality
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
         * Instantiate Http Client Implementation of Amazon FPS 
         ***********************************************************************/
        
        AmazonFPS service = null;
		try {
			service = new AmazonFPSClient(accessKeyId, secretAccessKey);
		} catch (AmazonFPSException e) {
			 System.out.println("Caught Exception: " + e.getMessage());
	   	        System.out.println("Response Status Code: " + e.getStatusCode());
	   	        System.out.println("Error Code: " + e.getErrorCode());
	   	        System.out.println("Error Type: " + e.getErrorType());
	   	        System.out.println("Request ID: " + e.getRequestId());
	   	        System.out.print("XML: " + e.getXML());
		}
        /************************************************************************
         * Uncomment to try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - Service URL
         *  - User Agent String to be sent to Amazon FPS   service
         *
         ***********************************************************************/
        // AmazonFPSConfig config = new AmazonFPSConfig();
        // config.setSignatureVersion("0");
        // AmazonFPS service = new AmazonFPSClient(accessKeyId, secretAccessKey, config);
 
        /************************************************************************
         * Uncomment to try out Mock Service that simulates Amazon FPS 
         * responses without calling Amazon FPS  service.
         *
         * Responses are loaded from local XML files. You can tweak XML files to
         * experiment with various outputs during development
         *
         * XML files available under com/amazonaws/fps/mock tree
         *
         ***********************************************************************/
        // AmazonFPS service = new AmazonFPSMock();

        /************************************************************************
         * Setup request parameters and uncomment invoke to try out 
         * sample for Get Total Prepaid Liability 
         ***********************************************************************/
         GetTotalPrepaidLiabilityRequest request = new GetTotalPrepaidLiabilityRequest();
        
         // @TODO: set request parameters here

         // invokeGetTotalPrepaidLiability(service, request);

    }


                                                                                
    /**
     * Get Total Prepaid Liability  request sample
     * 
     * Returns the total liability held by the given account corresponding to all the prepaid instruments owned by the account.
     *   
     * @param service instance of AmazonFPS service
     * @param request Action to invoke
     */
    public static void invokeGetTotalPrepaidLiability(AmazonFPS service, GetTotalPrepaidLiabilityRequest request) {
        try {
            
            GetTotalPrepaidLiabilityResponse response = service.getTotalPrepaidLiability(request);

            
            System.out.println ("GetTotalPrepaidLiability Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.println("    GetTotalPrepaidLiabilityResponse");
            System.out.println();
            if (response.isSetGetTotalPrepaidLiabilityResult()) {
                System.out.println("        GetTotalPrepaidLiabilityResult");
                System.out.println();
                GetTotalPrepaidLiabilityResult  getTotalPrepaidLiabilityResult = response.getGetTotalPrepaidLiabilityResult();
                if (getTotalPrepaidLiabilityResult.isSetOutstandingPrepaidLiability()) {
                    System.out.println("            OutstandingPrepaidLiability");
                    System.out.println();
                    OutstandingPrepaidLiability  outstandingPrepaidLiability = getTotalPrepaidLiabilityResult.getOutstandingPrepaidLiability();
                    if (outstandingPrepaidLiability.isSetOutstandingBalance()) {
                        System.out.println("                OutstandingBalance");
                        System.out.println();
                        Amount  outstandingBalance = outstandingPrepaidLiability.getOutstandingBalance();
                        if (outstandingBalance.isSetCurrencyCode()) {
                            System.out.println("                    CurrencyCode");
                            System.out.println();
                            System.out.println("                        " + outstandingBalance.getCurrencyCode().value());
                            System.out.println();
                        }
                        if (outstandingBalance.isSetValue()) {
                            System.out.println("                    Value");
                            System.out.println();
                            System.out.println("                        " + outstandingBalance.getValue());
                            System.out.println();
                        }
                    } 
                    if (outstandingPrepaidLiability.isSetPendingInBalance()) {
                        System.out.println("                PendingInBalance");
                        System.out.println();
                        Amount  pendingInBalance = outstandingPrepaidLiability.getPendingInBalance();
                        if (pendingInBalance.isSetCurrencyCode()) {
                            System.out.println("                    CurrencyCode");
                            System.out.println();
                            System.out.println("                        " + pendingInBalance.getCurrencyCode().value());
                            System.out.println();
                        }
                        if (pendingInBalance.isSetValue()) {
                            System.out.println("                    Value");
                            System.out.println();
                            System.out.println("                        " + pendingInBalance.getValue());
                            System.out.println();
                        }
                    } 
                } 
            } 
            if (response.isSetResponseMetadata()) {
                System.out.println("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.println("            RequestId");
                    System.out.println();
                    System.out.println("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();

           
        } catch (AmazonFPSException ex) {
            
            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
        }
    }
                                                    
}
