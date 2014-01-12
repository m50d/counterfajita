package net.homelinux.md401.counterfajita

import akka.actor.Actor
import akka.actor.FSM

sealed trait PersonState
case object Unemployed extends PersonState
case class Employed() extends PersonState

object CounterFajita {
	
}

class Person extends Actor with FSM[PersonState, Any] {
  
}