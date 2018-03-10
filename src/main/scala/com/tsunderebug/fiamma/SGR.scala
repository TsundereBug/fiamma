package com.tsunderebug.fiamma

import com.googlecode.lanterna

sealed trait SGR {
  val internal: lanterna.SGR
}
object SGR {
  case object Bold extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.BOLD
  }
  case object Reverse extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.REVERSE
  }
  case object Underline extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.UNDERLINE
  }
  case object Blink extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.BLINK
  }
  case object Bordered extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.BORDERED
  }
  case object Fraktur extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.FRAKTUR
  }
  case object CrossedOut extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.CROSSED_OUT
  }
  case object Circled extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.CIRCLED
  }
  case object Italic extends SGR {
    override val internal: lanterna.SGR = lanterna.SGR.ITALIC
  }
}
