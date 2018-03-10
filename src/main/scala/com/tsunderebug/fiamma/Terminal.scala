package com.tsunderebug.fiamma

import com.googlecode.lanterna

object Terminal {

  def apply(implicit terminalFactory: lanterna.terminal.TerminalFactory): Terminal = new Terminal(terminalFactory.createTerminal())

}

class Terminal(provider: lanterna.terminal.Terminal) {

  lazy val resizeListeners: ResizeListeners = new ResizeListeners
  lazy val sgr: SGRContainer = new SGRContainer

  def clear(): Unit = provider.clearScreen()

  def enterPrivateMode(): Unit = provider.enterPrivateMode()
  def exitPrivateMode(): Unit = provider.exitPrivateMode()

  def bell(): Unit = provider.bell()

  def close(): Unit = provider.close()

  def cursorPosition: (Int, Int) = {
    val pos = provider.getCursorPosition
    (pos.getColumn, pos.getRow)
  }
  def cursorPosition_=(position: (Int, Int)): Unit = provider.setCursorPosition(position._1, position._2)

  private class ResizeListeners {

    def +=(listener: lanterna.terminal.TerminalResizeListener): Unit = provider.addResizeListener(listener)
    def -=(listener: lanterna.terminal.TerminalResizeListener): Unit = provider.removeResizeListener(listener)

  }

  private class SGRContainer {

    def +=(sgr: SGR): Unit = provider.enableSGR(sgr.internal)
    def -=(sgr: SGR): Unit = provider.disableSGR(sgr.internal)

  }

}
