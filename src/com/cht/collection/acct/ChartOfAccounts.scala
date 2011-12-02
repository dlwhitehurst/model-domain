/**
 * Copyright 2011 Cape Henry Technologies Inc.
 * 
 * Licensed under the Apache License, Version 2.0 
 * (the "License"); You may not use this file except 
 * in compliance with the License. You may obtain a 
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific 
 * language governing permissions and limitations under the 
 * License.
 * 
 */

package com.cht.collection.acct

import com.cht.model.acct._

/**
 * A Scala singleton object to represent our Chart of Accounts
 */
object ChartOfAccounts {
//	def create(default:Boolean):ChartOfAccounts = {
//	  if (default) 
//	    new ChartOfAccounts {
//		  initDefaults
//	  	}
//	  else 
//		new ChartOfAccounts {
//			var accounts = List{new Account {
				// initializations
//				}
//			}
//		}
//	}
}

/**
 * This Scala class represents the contract for a Chart of Accounts used to support
 * the financial accounting needs of any business
 */
class ChartOfAccounts {
  
  var accounts:List[Account] = null
  
  var lastAssetCode:Int = 0
  
  var lastLiabilityCode:Int = 0
  
  var lastEquityCode:Int = 0
  
  var lastExpenseCode:Int = 0
  
  var lastRevenueCode:Int = 0
  
  
  /**
   * A method to initialize the chart of accounts with a default set of working
   * accounts
   */
  def initDefaults = {
    // create a base set of accounts
  val list = List(
      Asset("Cash","Unknown","100.00"),
      Expense("Office Supplies","Unknown","25.00"),
      Expense("Books and Periodicals","Unknown","75.00"),
      Equity("Capital","Unknown","1000.00"),
      Revenue("Income","Unknown","750.00"))
    
  }
  
  /**
   * A method to return a unique code that relates to the account type, asset, 
   * liability, etc.
   */
  def getAvailableCode(acctType:String, offset:Int):String = {
    
    var c = 0
    
    // Asset
    if (acctType.equals("Asset")) {
    	if (lastAssetCode != null)
    		c = lastAssetCode + offset
    	else c = 100
    	   	lastAssetCode = c
    	return c.toString()
    }
    
    // Liability
    if (acctType.equals("Liability")) {
    	if (lastLiabilityCode != null)
    		c = lastLiabilityCode + offset
    	else c = 200
    	  	lastLiabilityCode = c
    	return c.toString()
    }
    
    // Equity
    if (acctType.equals("Equity")) {
    	if (lastEquityCode != null)
    		c = lastEquityCode + offset
    	else c = 300
    	  	lastEquityCode = c
    	return c.toString()
    	}
    
    // Expense
    if (acctType.equals("Expense")) {
    	if (lastExpenseCode != null)
    		c = lastExpenseCode + offset
    	else c = 400
    	  	lastLiabilityCode = c
    	return c.toString()
    }
    
    // Revenue
    if (acctType.equals("Revenue")) {
    	if (lastRevenueCode != null)
    		c = lastRevenueCode + offset
    	else c = 500
    	  	lastRevenueCode = c
    	return c.toString()
    }

   return c.toString()
  }

}