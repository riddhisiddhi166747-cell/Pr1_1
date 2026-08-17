# Kotlin Practical-1

## 📌 Practical Title
**Develop a Kotlin Program for Demonstrating Various Programming Concepts**

## 📖 Description
This practical demonstrates the basic and important programming concepts of the **Kotlin programming language**. It covers variables, data types, type conversion, user input, control flow, functions, recursion, arrays, ArrayList, classes, constructors, operator overloading, and matrix operations.

---

## 🎯 Objectives

- To understand different data types and variables in Kotlin.
- To perform type conversion between different data types.
- To accept and display student information.
- To use conditional statements and `when` expressions.
- To create and use user-defined functions.
- To understand recursion using factorial calculation.
- To perform different operations on arrays.
- To find the maximum value from an `ArrayList`.
- To understand classes and constructors.
- To implement operator overloading in Kotlin.
- To perform matrix addition, subtraction, and multiplication.

---

## 🛠️ Requirements

- **Programming Language:** Kotlin
- **IDE:** IntelliJ IDEA / Android Studio
- **JDK:** Java Development Kit (JDK)
- Basic knowledge of Kotlin syntax and programming concepts.

---

# 📚 Practical Tasks

## 1.1 Store & Display Values in Different Variables

Create variables using different Kotlin data types and display their values.

**Data Types Covered:**
- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

---

## 1.2 Type Conversion

Demonstrate type conversion between different data types.

Examples:

- Integer → Double
- String → Integer
- String → Double

Kotlin provides functions such as:

```kotlin
toDouble()
toInt()
toFloat()
toLong()
```

---

## 1.3 Scan Student Information

Accept student information from the user and display it.

**Information includes:**
- Student Name
- Enrollment Number
- Branch
- Semester
- Other required details

This demonstrates the use of `readLine()` for taking input from the user.

---

## 1.4 Check Odd or Even Numbers

Accept a number from the user and determine whether it is **odd or even**.

The condition can be directly used inside `println()` using Kotlin's `if-else` expression.

Example:

```kotlin
println(if (number % 2 == 0) "Even" else "Odd")
```

---

## 1.5 Display Month Name

Accept a month number from the user and display the corresponding month name.

A Kotlin `when` expression is used for this purpose.

Example:

```kotlin
when(month) {
    1 -> println("January")
    2 -> println("February")
    // ...
}
```

---

## 1.6 User-Defined Function

Create a user-defined function to perform arithmetic operations on two numbers.

**Operations:**
- Addition
- Subtraction
- Multiplication
- Division

Functions help in making programs modular, reusable, and easier to understand.

---

## 1.7 Factorial Calculation with Recursion

Calculate the factorial of a number using a **recursive function**.

For example:

```text
5! = 5 × 4 × 3 × 2 × 1
5! = 120
```

The function repeatedly calls itself until it reaches the base condition.

---

## 1.8 Working with Arrays

Perform different operations on arrays in Kotlin.

### Operations Covered

- `Arrays.deepToString()`
- `contentDeepToString()`
- `IntArray.joinToString()`
- Printing array elements
- Using different loops

### Loop Types

- `range`
- `downTo`
- `until`

### Array Sorting

Sort an integer array:

1. **Without using built-in functions**  
   Implement a sorting algorithm manually.

2. **Using built-in functions**  
   Use Kotlin's built-in sorting functions.

---

## 1.9 Find Maximum Number from ArrayList

Create an `ArrayList` containing integers and find the **maximum number** from the list.

Example:

```text
ArrayList = [10, 25, 7, 45, 18]

Maximum = 45
```

---

## 1.10 Class and Constructor Creation

Create classes and constructors in Kotlin.

A **Car** class is created with properties such as:

- Type
- Model
- Price
- Owner
- Miles Driven

### Functions

The class should provide functions to:

- Get car information
- Get original car price
- Calculate current car price
- Display car information

This practical demonstrates the concepts of **classes, properties, constructors, and member functions**.

---

## 1.11 Operator Overloading and Matrix Operations

Understand and implement **operator overloading** using a `Matrix` class.

### Matrix Operations

- Matrix Addition
- Matrix Subtraction
- Matrix Multiplication

Operators can be overloaded in Kotlin using the `operator` keyword.

Example:

```kotlin
operator fun plus(other: Matrix): Matrix
```

The `toString()` function is also overloaded to provide customized matrix output.

---

# 🧠 Concepts Covered

| No. | Concept |
|---|---|
| 1 | Variables and Data Types |
| 2 | Type Conversion |
| 3 | User Input |
| 4 | `if-else` Expression |
| 5 | `when` Expression |
| 6 | User-Defined Functions |
| 7 | Recursion |
| 8 | Arrays |
| 9 | ArrayList |
| 10 | Loops |
| 11 | Sorting |
| 12 | Classes |
| 13 | Constructors |
| 14 | Member Functions |
| 15 | Operator Overloading |
| 16 | Matrix Operations |
| 17 | `toString()` Overriding |

---

# 📂 Suggested Project Structure

```text
Kotlin-Practical-1/
│
├── README.md
│
├── Practical1_1_DataTypes.kt
├── Practical1_2_TypeConversion.kt
├── Practical1_3_StudentInfo.kt
├── Practical1_4_OddEven.kt
├── Practical1_5_MonthName.kt
├── Practical1_6_ArithmeticFunction.kt
├── Practical1_7_Factorial.kt
├── Practical1_8_Arrays.kt
├── Practical1_9_ArrayListMaximum.kt
├── Practical1_10_CarClass.kt
└── Practical1_11_MatrixOperatorOverloading.kt
```

---

# ▶️ How to Run

1. Install **IntelliJ IDEA** or **Android Studio**.
2. Install and configure the **JDK**.
3. Create/open a Kotlin project.
4. Add the required `.kt` files.
5. Open the required Kotlin file.
6. Run the `main()` function.
7. Enter input wherever required and observe the output.

---

# 📌 Conclusion

This practical provides a basic understanding of Kotlin programming concepts. By completing these programs, we learn how to work with variables, data types, input/output, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations in Kotlin.
