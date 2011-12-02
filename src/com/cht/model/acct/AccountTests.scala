package com.cht.model.acct

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class AccountTests extends Spec with ShouldMatchers {

  // new account id
  describe("Account Utility - ") {
    it("Test getNextAccountId") {
		val id = AccountUtil.getNextAccountId
        id should be (6)
    }
  }

  // new transaction id for particular account id
  describe("Account Utility - ") {
    it("Test getNextTransactionId") {
		val id = AccountUtil.getNextTransactionId(4)
        id should be (2)
    }
  }

  // new asset account code
  describe("Account Utility - ") {
    it("Test getNextAssetCode") {
		val id = AccountUtil.getNextAssetCode
        id should be (120)
    }
  }
  
  // new liability account code
  describe("Account Utility - ") {
    it("Test getNextLiabilityCode") {
		val id = AccountUtil.getNextLiabilityCode
        id should be (220)
    }
  }
  
  // new equity account code
  describe("Account Utility - ") {
    it("Test getNextEquityCode") {
		val id = AccountUtil.getNextEquityCode
        id should be (320)
    }
  }
  
  // new revenue account code
  describe("Account Utility - ") {
    it("Test getNextRevenueCode") {
		val id = AccountUtil.getNextRevenueCode
        id should be (420)
    }
  }
  
  // new expense account code
  describe("Account Utility - ") {
    it("Test getNextExpenseCode") {
		val id = AccountUtil.getNextExpenseCode
        id should be (520)
    }
  }
}