import kotlin.math.PI

// 3-08 Challenge - Interfaces - Starter

/*
Challenge 1:
  - Create an interface `Shape` that defines a property `area` of type Double.
  - Implement `Shape` with classes representing Square, Triangle, and Circle.
  - Add a circle, a square, and a triangle to an array.
  - Convert the array of shapes to an array of areas using map.

 **HINTS**
 - The area of a square = one of its sides squared
 - The area of a triangle = 0.5 multiplied by its base multiplied by its height
 - The area of a circle = pi multiplied by its radius squared
*/

interface Shape {
    val area: Double
}

class Square(val side: Double) : Shape {
    override val area: Double
        get() = side * side
}

class Triangle(val base: Double, val height: Double) : Shape {
    override val area: Double
        get() = 0.5 * base * height
}

class CircleShape(val radius: Double) : Shape {
    override val area: Double
        get() = PI * radius * radius

}

fun main() {
    val square = Square(5.0)
    val triangle = Triangle(5.0, 7.0)
    val circleShape = CircleShape(5.0)

    val shapes = listOf(square, triangle, circleShape)
    val areas = shapes.map { it.area }
    println(areas)
}