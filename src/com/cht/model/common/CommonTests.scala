package com.cht.model.common

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class CommonTests extends Spec with ShouldMatchers {
  describe("Person:") {
    it("toString is invoked on a newly created Person") {
		val peep = new Person("Mr.","David",List("L."),"Whitehurst","",List("CS","PHD"))
		val name = peep.toString
        name should be ("Mr. David L. Whitehurst CS,PHD")

    }
  }
}