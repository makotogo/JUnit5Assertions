/*
 * Copyright 2017 Makoto Consulting Group, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.makotojava.learn.junit5.math;

/**
 * Simple set of utilities. Just something to demonstrate tests.
 * Nothing more.
 * 
 * @author J Steven Perry
 *
 */
public class YetAnotherUtility {

  /**
   * 
   * Uses the slow but steady Trial Division algorithm for calculating
   * factors.
   * 
   * https://en.wikipedia.org/wiki/Trial_division
   * 
   * @param compoundInteger
   *          The integer number (using the mathematical term "integer" here,
   *          not the Java primitive type) to check.
   *          The compound integer must be greater than zero.
   * 
   * @return long[] - an array of factors. Will be null if the compound integer is
   *         less than or equal to zero.
   */
  public static long[] computeFactors(long compoundInteger) {
    long[] ret = null;
    //
    // TODO: ADD YOUR IMPLEMENTATION HERE
    //
    return ret;
  }

}
