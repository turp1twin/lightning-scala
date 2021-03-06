package org.viz.lightning

import org.scalatest.{BeforeAndAfterAll, FunSuite}

class LightningPlotsSuite extends FunSuite with BeforeAndAfterAll {

  var lgn: Lightning = _

  override def beforeAll() {
    lgn = Lightning("http://localhost:3000")
    lgn.createSession("test-plots")
  }

  test("line") {
    lgn.line(Array(Array(1.0, 2.0), Array(2.0, 1.0)))
  }

  test("line (single)") {
    lgn.line(Array(Array(1.0, 2.0)))
  }

  test("matrix") {
    lgn.matrix(Array(Array(1.0, 2.0), Array(2.0, 1.0)))
  }

  test("scatter") {
    lgn.scatter(Array(1.0, 2.0), Array(2.0, 1.0))
  }



}
