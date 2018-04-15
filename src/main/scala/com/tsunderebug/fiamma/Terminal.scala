import com.tsunderebug.fiamma.io.IOControl

package com.tsunderebug.fiamma {

  object Terminal {

    def width: Int = IOControl.windowSize.columns.toInt
    def height: Int = IOControl.windowSize.rows.toInt

    // TODO removeme, used for testing
    def main(args: Array[String]): Unit = {
      (0 until height).foreach((y) => {
        (0 until width).foreach((x) => {
          print((y * x).toString.takeRight(1))
        })
        println()
      })
    }

  }

}