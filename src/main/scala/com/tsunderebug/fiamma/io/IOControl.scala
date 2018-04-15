import scala.scalanative.native

package com.tsunderebug.fiamma {

  package io {

    object IOControl {

      object IOCTLCodes {

        val tiocgwinsz = 0x00005413

      }

      type WindowSizeStruct = native.CStruct4[native.CUnsignedShort, native.CUnsignedShort, native.CUnsignedShort, native.CUnsignedShort]

      def windowSize: WindowSize = {
        val filler = native.stackalloc[WindowSizeStruct]
        libc.ioctl(0, IOCTLCodes.tiocgwinsz, filler)
        WindowSize(!filler._1, !filler._2, !filler._3, !filler._4)
      }

    }

  }

}