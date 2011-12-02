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

package com.cht.model.common

/**
 * Scala class to represent any person
 */
class Person (pre:String, first:String, middle:List[String],last:String,
    suff:String,accred:List[String]) {
  
    /**
     * name prefix e.g. Mr. Mrs. Ms.
     */
	val prefix = pre
	
	/**
	 * first name
	 */
	val firstName = first
	
	/**
	 * List of middle names
	 */
	val middleName = middle
	
	/**
	 * last name
	 */
	val lastName = last
	
	/**
	 * name suffix e.g. III, Jr.
	 */
	val suffix = suff
	
	/**
	 * List of accreditations e.g. DDS, DR, PHD
	 */
	val accreditation = accred
	
	/**
	 * overridden toString method
	 */
	override def toString:String = {
	  var retVal = ""
	    
	  if (prefix != null && prefix.length > 1) 
	    retVal = retVal + prefix
	  if (firstName != null && firstName.length > 1)
	    if (!retVal.equals(""))
	    	retVal = retVal + " " + firstName
	    	else
	    	  retVal = retVal + firstName
	  if (middleName != null) {
	    val i = middleName.toIterator
	    for (name <- i)
	      retVal = retVal + " " + name
	  }
	  if (lastName != null && lastName.length > 1)
	    retVal = retVal + " " + lastName
	  if (suffix != null & suffix.length > 1 )
	    retVal = retVal + " " + suffix
	  if (accreditation != null) {
	    val j = accreditation.toIterator
	    var first = 0
	    for (cred <- j) {
	      if (first == 0)
	      retVal = retVal + " " + cred
	      else
	        retVal = retVal + "," + cred
	    first += 1
	    }
	  }
	    return retVal 
	} 
			
}