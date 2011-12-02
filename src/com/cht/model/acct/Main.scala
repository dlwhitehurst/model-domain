package com.cht.model.acct

import com.cht.model.financial._
import com.cht.collection.acct._

object Main extends App {

  var chart:ChartOfAccounts = ChartOfAccounts.create(true)
  
  println("A Chart of Accounts")
  println("************************************")
  println
  chart.printChart
  println("************************************")
  println
  println("The default chart holds " + chart.accounts.length + " accounts")
}