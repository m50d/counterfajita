package net.homelinux.md401.counterfajita

import akka.actor.Actor
import akka.actor.FSM

sealed trait PersonState
case object Unemployed extends PersonState
case class Employed(hours: Int) extends PersonState

object CounterFajita {

}

//Person should have: active hours, desired money.
//Hears about a certain proportion of available jobs given spare hours.
//Applies for a job in proportion to thing.

class Person extends Actor with FSM[PersonState, Any] {
  startWith(Unemployed, "")

  when(Unemployed) {
    case Event("", "") =>
      stay
  }
}