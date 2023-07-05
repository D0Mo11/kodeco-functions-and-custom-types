// 3-06 Challenge - Classes - Starter

/*
Challenge 1 - Building a Class Hierarchy
Create a class named `Animal` that has…
1. a method named `speak()` that does nothing.

Create two `Animal` subclasses...
1. `WildAnimal` that...
  - has an `isPoisonous` property, that is a `Boolean`
2. `Pet` that...
  - has a stored property named `name`, that is a `String`
  - has a `play()` method that prints out a message
  - overrides `speak()` - It should print out a message

Create one subclass of your choice of `WildAnimal` or `Pet`. It should do at least one of the following:
 - override `speak()`
 - override `play()`
 - Add a new property with custom accessor
 - Add a new method
*/


/*
Challenge 2 - Overriding & Polymorphism
- Write a function that takes an `Animal` and does something different depending on what subclass it is.
  You'll need to do some safe casting and null checks!
- Create at least one instance of each class from the first challenge.
- Create an array that contains all of the instances.
- Call the function with each of your instances using a loop or whatever other method you'd like!
*/

open class Animal {
    open fun speak() {}
}

class WildAnimal(val isPoisonous: Boolean) : Animal()

open class Pet(val name: String) : Animal() {
    fun play() {
        println("Playing")
    }

    override fun speak() {
        println("Speaking")
    }
}

class Dog(name: String) : Pet(name) {
    override fun speak() {
        println("Woof Woof")
    }
}

fun main() {
    fun animalDoSomething(animal: Animal) {
        when (animal) {
            is WildAnimal -> {
                if (animal.isPoisonous) println("poisonous animal") else println("not poisonous animal")
            }

            is Dog -> {
                animal.speak()
            }

            is Pet -> {
                animal.play()
            }

            else -> {
                println("just animal")
            }
        }
    }

    val animal = Animal()
    val poisonousWildAnimal = WildAnimal(true)
    val nonPoisonousWildAnimal = WildAnimal(false)
    val pet = Pet("Max")
    val dog = Dog("Rex")

    val animals = listOf(animal, poisonousWildAnimal, nonPoisonousWildAnimal, pet, dog)
    animals.forEach { animalDoSomething(it) }
}