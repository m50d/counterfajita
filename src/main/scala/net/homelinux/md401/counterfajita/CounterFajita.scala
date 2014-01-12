package net.homelinux.md401.counterfajita

import akka.actor.Actor
import akka.actor.FSM
import java.util.UUID

sealed trait PersonState
case object Unemployed extends PersonState
case class Employed(hours: Int) extends PersonState

object CounterFajita {

}

//Person should have: active hours, desired money.
//Hears about a certain proportion of available jobs given spare hours.
//Applies for a job in proportion to thing.

//Available jobs:
//Num hours
//Value produced
//Pay

case class AvailableJob()

case class Person()

case class WorldState(availableJobs: Map[UUID, AvailableJob],
  people: Map[UUID, Person],
  employments: Map[UUID, UUID]
)
//}