package com.cht.model.financial

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec
import com.cht.constant._

@RunWith(classOf[JUnitRunner])
class FinancialTests extends Spec with ShouldMatchers {
  describe("Money:") {
    it("should create and display $2345.56 from 234556 input") {
        val money = new Money("234556", FinancialConstants.NUMERIC_ONLY, 2, "USD")
        money.displayAmount should be ("$2345.56")

    }
  }
  describe("Money:") {
    it("should create and display $350.75 from 350.75 input") {
        val money = new Money ("350.75", FinancialConstants.NUMERIC_DEC, 2, "USD")
        money.displayAmount should be ("$350.75")

    }
  }

  describe("Money:") {
    it("should validate ZZZ as an unacceptable ISO-4217 currency code, throw IllegalArgumentException") {
    	val thrown = intercept[java.lang.IllegalArgumentException] {
    		val money = new Money ("350.75", FinancialConstants.NUMERIC_DEC, 2, "ZZZ")
    	}
    	assert(thrown.getMessage === "Currency code is not one of the ISO-4217 accepted values.")	
    }
  }

  describe("Currency:") {
    it("should validate EUR as an acceptable ISO-4217 currency code") {
    	Currency.validateCurrencyCode("EUR") should be (true)
    }
  }

  describe("Currency:") {
    it("should validate ZWL as an acceptable ISO-4217 currency code") {
    	Currency.validateCurrencyCode("ZWL") should be (true)
    }
  }

  describe("Currency:") {
    it("should validate LBP as an acceptable ISO-4217 currency code") {
    	Currency.validateCurrencyCode("LBP") should be (true)
    }
  }

  describe("Currency:") {
    it("should validate ABC as an unacceptable ISO-4217 currency code") {
    	val thrown = intercept[org.scalatest.TestFailedException] {
    		Currency.validateCurrencyCode("ABC") should be (true)
    	}
    	assert(thrown.getMessage === "false was not true")	
    }
  }

}