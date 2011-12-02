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
import com.cht.constant._

/**
 * A Scala singleton object to represent our Chart of Accounts
 */
object ChartOfAccounts {
    
	def create(default:Boolean):ChartOfAccounts = {
	  if (default) 
	    new ChartOfAccounts {
		  initDefaults
	  	}
	  else 
		new ChartOfAccounts {
			accounts = List(new Asset("100","Cash",AccountConstants.DEBIT))
		}
	}
}

/**
 * This Scala class represents the contract for a Chart of Accounts used to support
 * the financial accounting needs of any business
 */
class ChartOfAccounts {
  
  var accounts:List[Account] = null
 
  /**
   * A method to initialize the chart of accounts with a default set of working
   * accounts
   */
  def initDefaults = {
    // create a base set of accounts
	  accounts = List(
      Asset("100","Cash",AccountConstants.DEBIT),
      Asset("101","Equipment",AccountConstants.DEBIT),
      
      Liability("200","Taxes Payable", AccountConstants.CREDIT),
      Liability("201","Expenses Payable", AccountConstants.CREDIT),
      Liability("202","Liability Insurance Payable", AccountConstants.CREDIT),
      Liability("203","Workers Comp Payable", AccountConstants.CREDIT),
      
      Equity("300","Capital", AccountConstants.CREDIT),
      Equity("301","Retained Earnings", AccountConstants.CREDIT),
      Equity("302","Shareholder Distributions", AccountConstants.CREDIT),

      Revenue("400","Income", AccountConstants.CREDIT),
      Revenue("401","Interest Earned", AccountConstants.CREDIT),
      
      Expense("500","Office Supplies", AccountConstants.DEBIT),
      Expense("501","Rent Expense", AccountConstants.DEBIT),
      Expense("502","Electric Expense", AccountConstants.DEBIT),
      Expense("503","Medical Expense", AccountConstants.DEBIT),
      Expense("504","Capital Expense", AccountConstants.DEBIT),
      Expense("505","Books and Periodicals", AccountConstants.DEBIT),
      Expense("506","Miscellaneous Expense", AccountConstants.DEBIT),
      Expense("507","Software", AccountConstants.DEBIT),
      Expense("508","Network and Hosting", AccountConstants.DEBIT),
      Expense("509","Liability Insurance", AccountConstants.DEBIT),
      Expense("510","Workers Compensation", AccountConstants.DEBIT),
      Expense("511","Postage Expense", AccountConstants.DEBIT),
      Expense("512","Shipping Expense", AccountConstants.DEBIT),
      Expense("513","Meals Expense", AccountConstants.DEBIT),
      Expense("514","Auto Expense", AccountConstants.DEBIT))
      
  }
  
  def printChart = {
	val iter = accounts.toIterator
  
	for (acct <- iter) 
		printAccount(acct)
  }
  
      
  def printAccount(account:Account) {
    account match {
      case Asset (a,b,c) =>
        println (a + "," + b + "," + c)
      case Liability (a,b,c) =>
        println (a + "," + b + "," + c)
      case Revenue (a,b,c) =>
        println (a + "," + b + "," + c)
      case Expense (a,b,c) =>
        println (a + "," + b + "," + c)
      case Equity(a,b,c) =>
        println (a + "," + b + "," + c)
    }
  }
  
}