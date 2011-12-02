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

package com.cht.model.acct

object AccountUtil {
  
   /**
	* last account number sequenced
	*/
	var accountSeq = 5
	
   /**
    * last transaction id sequenced for each account id
    */
	var transactionSeqs:List[(Int,Int)] = List((1,1),(2,1),(3,1),(4,1),(5,1))
   
   /**
    * list of current account ids (not codes, key identifiers)
    */
	val accountIds = List(1,2,3,4,5)
   
   /**
    * tuple (account id, transaction id)
    */
	val transactionIds:List[(Int,Int)] = List((1,1),(2,1),(3,1),(4,1),(5,1)) // tuple (account id, transaction id)
   
	var assetCodeSeq = 119 // base 100
	var liabilityCodeSeq = 219 // base 200
	var equityCodeSeq = 319 // base 300
	var revenueCodeSeq = 419 // base 400
	var expenseCodeSeq = 519 // base 500

	/**
    * get the next account number in the sequence
    */
	def getNextAccountId:Int = {
	  accountSeq += 1
      return accountSeq
    }

	/**
	 * get a new asset code
	 */
	def getNextAssetCode:Int = {
	 assetCodeSeq +=1
	 return assetCodeSeq
	}

	/**
	 * get a new liability code
	 */
	def getNextLiabilityCode:Int = {
	 liabilityCodeSeq +=1
	 return liabilityCodeSeq
	}
	
	/**
	 * get a new equity code
	 */
	def getNextEquityCode:Int = {
	 equityCodeSeq +=1
	 return equityCodeSeq
	}
	
	/**
	 * get a new revenue code
	 */
	def getNextRevenueCode:Int = {
	 revenueCodeSeq +=1
	 return revenueCodeSeq
	}
	
	/**
	 * get a new expense code
	 */
	def getNextExpenseCode:Int = {
	 expenseCodeSeq +=1
	 return expenseCodeSeq
	}
	
   /**
    * get the next transaction id sequenced for a particular account id
    */
    def getNextTransactionId(acctId:Int):Int = {
      var retVal = -1
      transactionSeqs.foreach {
        (tup) => val(a,b) = tup
        if (a == acctId) {
          retVal = b + 1 // got new transaction id
          transactionSeqs = transactionSeqs:::List((a,retVal)) // add new tuple
          transactionSeqs = remove((a,b),transactionSeqs) // remove old tuple
        }
      }
      return retVal
    }
    
    /**
     * method to remove old tuple with earlier transaction id
     */
	def remove(tup: (Int,Int), list: List[(Int,Int)]) = list diff List(tup)
    
}