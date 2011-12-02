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

import com.cht.model.financial._
import com.cht.constant._

class AccountTransaction(transAmt:Money, sgn:Int) {
  
  val transactionAmt:Money = transAmt
  var sign = sgn // 1 positive, would be -1 if negative
  var transactionNo:Int = 0 // identifying transaction number, requires generation
  
  /**
   * overridden toString method
   */
  override def toString:String = {
	var retVal = ""
   	
	if (sign == -1)
	  retVal = "-" + transactionAmt.toString
	else retVal = transactionAmt.toString
	
	return retVal
 
  }
}
