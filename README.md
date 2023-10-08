# FoodDiary App

The FoodDiary app is a versatile food journal designed to help users keep track of their food consumption. It provides a convenient way to log the foods they eat, along with important details, while also incorporating Firebase authentication for user accounts.

## Features

- **Food Logging:** Users can add entries to their food diary, recording the foods they have consumed.

- **Food Details:** Each food entry allows users to provide details such as name, quantity, calorie count, and meal category.

- **Firebase Authentication:** Secure user accounts with Firebase authentication for a personalized experience.

- **Cross-Platform:** Built using Kotlin Multiplatform (KMP), it can run seamlessly on Android, iOS, and more.

- **Jetpack Compose UI:** The app employs Jetpack Compose for creating user interfaces in a declarative manner, providing an intuitive and visually appealing experience.

- **Moko MVVM:** Utilizes the Moko library to implement the MVVM (Model-View-ViewModel) architecture, enhancing code organization and maintainability.

- **Resource Management:** Efficiently manages and accesses platform-specific resources in a cross-platform manner.

- **Networking with Ktor:** Establishes basic network calls for syncing data with external services.

## Getting Started

### Prerequisites

Before you start using the FoodDiary app, make sure you have the following:

- [Android Studio](https://developer.android.com/studio) with Kotlin support.
- [Xcode](https://developer.apple.com/xcode/) for iOS development (if targeting iOS).
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) or another Kotlin-friendly IDE for shared code development.

### Project Structure

The project is structured as follows:

- **androidApp:** Android-specific code and Compose UI.
- **iosApp:** iOS-specific code and UI (Swift/Kotlin Multiplatform).
- **shared:** Shared Kotlin code for core functionality.
- **data:** Data layer, including repositories and data models.
- **presentation:** Presentation layer, including view models and UI logic.
- **resources:** Shared resources like images, and strings.

## Configure Resources

Place your platform-specific resources (images, fonts, etc.) in the appropriate folders under the `resources` directory. Use the `ResourceProvider` class to access these resources in a cross-platform way.

## Precompose Navigation

The project includes basic navigation setup using a `NavController` in the Android app module. You can extend this navigation setup as needed for your project.

## Build and Run

- Build and run the Android app using Android Studio.
- Build and run the iOS app using Xcode.

## Usage

The FoodDiary app serves as a solid starting point for building your food journal or tracking app. Here's how you can use it:

- Define your shared logic and data models in the `shared` module.
- Implement platform-specific UI using Compose in the `androidApp` and `iosApp` modules.
- Customize the navigation and UI structure to match your project requirements.
- Extend Firebase authentication and integrate it with your user account system.
- Add additional features and functionalities as needed.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing

Feel free to contribute to this project by creating issues, submitting pull requests, or providing feedback.

## Acknowledgments

- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Moko MVVM](https://github.com/icerockdev/moko-mvvm)
- [Ktor](https://ktor.io/)

## Contact

If you have any questions or need further assistance, please don't hesitate to reach out to furqanullah717@gmail.com.