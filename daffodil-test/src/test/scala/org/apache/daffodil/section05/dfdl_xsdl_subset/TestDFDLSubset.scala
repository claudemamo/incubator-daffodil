/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.daffodil.section05.dfdl_xsdl_subset

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestDFDLSubset {

  val testDir = "/org/apache/daffodil/section05/dfdl_xsdl_subset/"
  val runner = Runner(testDir, "DFDLSubset.tdml", validateTDMLFile = true, validateDFDLSchemas = false)

  @AfterClass def tearDown() {
    runner.reset
  }

}

class TestDFDLSubset {

  import TestDFDLSubset._

  @Test def test_groupRefGroupRef() { { runner.runOneTest("groupRefGroupRef") } }
  @Test def test_refInitiator3() { { runner.runOneTest("refInitiator3") } }
  @Test def test_groupRef() { { runner.runOneTest("groupRef") } }
  @Test def test_groupRefChoice() { runner.runOneTest("groupRefChoice") }
  @Test def test_badGroupRef() { { runner.runOneTest("badGroupRef") } }
  @Test def test_badSeq() { { runner.runOneTest("badSeq") } }

  @Test def test_groupRefDFDL() { runner.runOneTest("groupRefDFDL") }
}