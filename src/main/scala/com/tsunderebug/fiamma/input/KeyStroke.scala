package com.tsunderebug.fiamma.input

import com.googlecode.lanterna

object KeyStroke {

  def apply(internal: lanterna.input.KeyStroke): KeyStroke = new KeyStroke(Option(internal.getKeyType), Option(internal.getCharacter), internal.isCtrlDown, internal.isAltDown, internal.isShiftDown, internal.getEventTime)

}

case class KeyStroke(keyType: Option[lanterna.input.KeyType], char: Option[Char], ctrl: Boolean, alt: Boolean, shift: Boolean, eventTime: Long)
