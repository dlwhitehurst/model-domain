package com.cht.model.acct

import com.cht.model.financial._

object Main extends App {

  val list = List(
      Asset("Cash","Unknown","100.00"),
      Expense("Office Supplies","Unknown","25.00"),
      Expense("Books and Periodicals","Unknown","75.00"),
      Equity("Capital","Unknown","1000.00"),
      Revenue("Income","Unknown","750.00"))
      
  val iter = list.toIterator
  
  for (acct <- iter) 
    printAccounts(acct)
      
  def printAccounts(account:Account) {
    account match {
      case Asset (a,c,d) =>
        print ("Asset: " + a + "," + d + "\n")
      case Liability (a,c,d) =>
        print ("Liability: " + a + "," + d + "\n")
      case Revenue (a,c,d) =>
        print ("Revenue: " + a + "," + d + "\n")
    case Expense (a,c,d) =>
        print ("Expense: " + a + "," + d + "\n")
      case Equity(a,c,d) =>
        print ("Equity: " + a + "," + d + "\n")
    }
  }

}