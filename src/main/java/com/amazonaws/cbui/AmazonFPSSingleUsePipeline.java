/******************************************************************************* 
 *  Copyright 2008-2011 Amazon Technologies, Inc.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 */

package com.amazonaws.cbui;

import java.util.Map;

public class AmazonFPSSingleUsePipeline extends AmazonFPSCBUIPipeline {

    public AmazonFPSSingleUsePipeline(String accessKey, String secretKey) {
        super("SingleUse", accessKey, secretKey);
    }

    /**
     * Set mandatory parameters required for single use token pipeline.
     */
    public void setMandatoryParameters(String callerReference, String returnUrl, String transactionAmount) {
        addParameter("callerReference", callerReference);
        addParameter("returnURL", returnUrl);
        addParameter("transactionAmount", transactionAmount);
    }

    @Override
    protected void validateParameters(Map<String, String> parameters) {
        //mandatory parameters for single use pipeline
        if (!parameters.containsKey("transactionAmount")) {
            throw new RuntimeException("transactionAmount is missing in parameters.");
        }
    }

}
