
# Vehicle Simulation

- **Author:** Lisi Cao
- **Date:** 2023-09-16
- **Version:** 2.0

## Overview

The `VehicleSimulation` project demonstrates the utilization of abstract classes and interfaces in Java, providing a foundational understanding of object-oriented design principles.

## Structure

- **Vehicle** (Abstract Class): Represents a generic vehicle. It forms the base for specific types of vehicles, ensuring some common functionalities while leaving the startup mechanism abstract.
  
- **Drivable** (Interface): Ensures that any vehicle implementing this interface must have the ability to accelerate and brake.
  
- **Bus** (Concrete Class): An implementation of the `Vehicle` class that represents a bus, which can also be driven since it implements the `Drivable` interface.
  
- **Car** (Concrete Class): Another implementation of the `Vehicle` class representing a car. It too implements the `Drivable` interface, indicating its ability to be driven.

## Features

- **Abstraction**: By using the abstract class `Vehicle`, we ensure that all subclasses have certain methods while allowing flexibility in their specific implementations.
  
- **Interface Utilization**: The `Drivable` interface ensures a contract that every drivable vehicle must follow. Both the `Bus` and `Car` classes adhere to this contract.
  
- **Polymorphism**: Demonstrated in the `Demo` class, where `Vehicle` references can point to any subclass object, allowing dynamic method dispatch.
  
- **Type Checking and Casting**: The `Demo` class also illustrates the use of the `instanceof` operator to check the type of the object, followed by casting it to use interface-specific methods.

## How to Use

1. Create objects of `Bus` and `Car` classes.
2. Use the array of `Vehicle` type to store these objects.
3. Loop through the array and demonstrate the polymorphic behavior.
4. Use type checking to determine if the object implements the `Drivable` interface, and if so, cast it and invoke the `accelerate` and `brake` methods.

## Conclusion

The `VehicleSimulation` project is a beginner-friendly introduction to some of the core concepts of object-oriented programming in Java, such as abstraction, interfaces, polymorphism, and type checking. It's ideal for those looking to grasp these concepts through a simple and straightforward example.