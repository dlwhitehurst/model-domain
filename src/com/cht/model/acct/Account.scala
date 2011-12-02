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

abstract class Account extends AccountBalance with AccountActivity

case class Asset(name:String, basis:String, bal:String) extends Account {
  override def debitAccount(value:Money,acctType:Int):Money = {return null}
  override def creditAccount(value:Money,acctType:Int):Money = {return null}
  override def addTransaction(trans:AccountTransaction) = {}
  override def removeTransactionById(transId:Int) = {}
}
case class Liability(name:String, basis:String, bal:String) extends Account {
  override def debitAccount(value:Money,acctType:Int):Money = {return null}
  override def creditAccount(value:Money,acctType:Int):Money = {return null}
  override def addTransaction(trans:AccountTransaction) = {}
  override def removeTransactionById(transId:Int) = {}
}

case class Equity(name:String, basis:String, bal:String) extends Account {
  override def debitAccount(value:Money,acctType:Int):Money = {return null}
  override def creditAccount(value:Money,acctType:Int):Money = {return null}
  override def addTransaction(trans:AccountTransaction) = {}
  override def removeTransactionById(transId:Int) = {}
}

case class Revenue(name:String, basis:String, bal:String) extends Account {
  override def debitAccount(value:Money,acctType:Int):Money = {return null}
  override def creditAccount(value:Money,acctType:Int):Money = {return null}
  override def addTransaction(trans:AccountTransaction) = {}
  override def removeTransactionById(transId:Int) = {}
}

case class Expense(name:String, basis:String, bal:String) extends Account {
  override def debitAccount(value:Money,acctType:Int):Money = {return null}
  override def creditAccount(value:Money,acctType:Int):Money = {return null}
  override def addTransaction(trans:AccountTransaction) = {}
  override def removeTransactionById(transId:Int) = {}
}



