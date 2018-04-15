package com.tsunderebug

import scala.scalanative.native

package object fiamma {

  @native.extern
  object libc {
    def ioctl(fd: native.CInt, request: native.CInt, args: native.Ptr[_]): native.CInt = native.extern
  }

}
