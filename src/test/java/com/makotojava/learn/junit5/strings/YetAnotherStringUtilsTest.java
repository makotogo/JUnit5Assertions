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
package com.makotojava.learn.junit5.strings;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Tests the YetAnotherStringUtils utility class.
 * 
 * Demonstrates some of the methods and variants of the Jupiter
 * {@link org.junit.jupiter.api.Assertions Assertions} class.
 * 
 * @author J Steven Perry
 *
 */
@RunWith(JUnitPlatform.class)
@DisplayName("Testing YetAnotherStringUtils...")
public class YetAnotherStringUtilsTest {

  /**
   * @Nested class
   *         Uses Assertions.assertLinesMatch():
   *         <ul>
   *         <li>assertLinesMatch(List&lt;String&gt;, List&lt;String&gt;)</li>
   *         </ul>
   * @author J Steven Perry
   *
   */
  @Nested
  @DisplayName("When using assertLinesMatch")
  public class AssertLinesMatch {

    @Test
    @DisplayName("tokenize returns the correct tokens from the test string...")
    public void testTokenize() {
      String string = "This is a string of words,delimited by spaces, and, well, commas. Oh, and periods too.";
      String delimiters = " ,.";

      List<String> expectedTokens = Arrays.asList(new String[] {
          "This", "is", "a", "string", "of", "words", "delimited",
          "by", "spaces", "and", "well", "commas", "Oh",
          "and", "periods", "too"
      });

      List<String> actualTokens = YetAnotherStringUtils.tokenize(string, delimiters);

      fail("Add your implementation here");
    }

  }

  /**
   * @Nested class
   *         Uses Assertions.assertNotSame():
   *         <ul>
   *         <li>assertNotSame(Object)</li>
   *         <li>assertNotSame(Object, String)</li>
   *         <li>assertNotSame(Object, Supplier&lt;String&gt;)</li>
   *         </ul>
   * @author J Steven Perry
   *
   */
  @Nested
  @DisplayName("When using assertNotSame")
  public class AssertNotSame {

    @Test
    @DisplayName("tokenize returns the correct tokens from the test string...")
    public void testTokenize() {
      String string = "This is a string of words,delimited by spaces, and, well, commas. Oh, and periods too.";
      String delimiters = " ,.";

      List<String> expectedTokens = Arrays.asList(new String[] {
          "This", "is", "a", "string", "of", "words", "delimited",
          "by", "spaces", "and", "well", "commas", "Oh",
          "and", "periods", "too"
      });

      List<String> actualTokens = YetAnotherStringUtils.tokenize(string, delimiters);
      //
      // The list that is returned is different
      //
      // Supplier<String> message - creates String lazily (only if assertion fails)
      fail("Add your implementation here");

      // As are the strings that are returned as well
      for (int aa = 0; aa < expectedTokens.size(); aa++) {
        //
        // Supplier<String> message - creates String lazily (only if assertion fails)
        fail("Add your implementation here");
      }

    }

    @Test
    @DisplayName("Different references to the same string are the same object...")
    public void testAssertNotSame() {
      String expectedString = "this is a string of words".toUpperCase();
      String actualString = "this is a string of words".toUpperCase();
      //
      // The strings are .equals(), but different objects
      //
      // Supplier<String> message - creates String lazily (only if assertion fails)
      fail("Add your implementation here");

    }

  }

  /**
   * @Nested class
   *         Uses Assertions.assertSame():
   *         <ul>
   *         <li>assertSame(Object)</li>
   *         <li>assertSame(Object, String)</li>
   *         <li>assertSame(Object, Supplier&lt;String&gt;)</li>
   *         </ul>
   * @author J Steven Perry
   *
   */
  @Nested
  @DisplayName("When using assertSame")
  public class AssertSame {

    @Test
    @DisplayName("Different references to the same string are the same object...")
    public void testAssertSame() {
      String expectedString = "This is a string of words,delimited by spaces, and, well, commas. Oh, and periods too.";
      String actualString = expectedString;
      //
      // The list that is returned is different
      //
      // Supplier<String> message - creates String lazily (only if assertion fails)
      fail("Add your implementation here");

    }

    @Test
    @DisplayName("Different references to the same string are the same object...")
    public void testAssertSameWithStringLiterals() {
      String expectedString = "This is a string of words";
      String actualString = "This is a string of words";
      //
      // The strings are .equals(), but different objects (or are they? no, no they're not)
      //
      // Supplier<String> message - creates String lazily (only if assertion fails)
      fail("Add your implementation here");

    }

  }

}
