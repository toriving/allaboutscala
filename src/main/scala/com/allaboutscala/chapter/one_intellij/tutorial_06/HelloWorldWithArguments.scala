package com.allaboutscala.chapter.one_intellij.tutorial_06

object HelloWorldWithArguments extends App{

  println("Hello World WIth Arguments Scala Application!")

  println("Command line arguments are: ")
  println(args.mkString(", "))
}
