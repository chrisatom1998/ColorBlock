# ColorBlock

An interactive Android application that displays colorful blocks that users can tap to change the background color.

## Overview

ColorBlock is a simple, modern Android application built with Kotlin that demonstrates Material Design principles and interactive UI elements. Users can tap on different colored blocks to dynamically change the app's background color.

## Features

- 8 vibrant color blocks arranged in a grid
- Interactive tap-to-change background functionality
- Material Design 3 UI components
- View binding for safe view access
- Responsive layout with GridLayout

## Project Structure

```
ColorBlock/
├── app/
│   ├── build.gradle.kts          # App-level build configuration
│   ├── proguard-rules.pro        # ProGuard rules for release builds
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/colorblock/app/
│           │   └── MainActivity.kt
│           └── res/
│               ├── drawable/        # Vector drawables
│               ├── layout/          # XML layouts
│               │   └── activity_main.xml
│               ├── mipmap-*/        # App icons
│               ├── values/          # Colors, strings, themes
│               └── xml/             # Backup rules
├── gradle/
│   └── wrapper/                   # Gradle wrapper files
├── build.gradle.kts               # Root build configuration
├── settings.gradle.kts            # Project settings
├── gradle.properties              # Gradle properties
└── .gitignore                     # Git ignore rules

```

## Technical Stack

- **Language**: Kotlin 1.9.20
- **Min SDK**: Android 7.0 (API 24)
- **Target SDK**: Android 14 (API 34)
- **Build System**: Gradle 8.2 with Kotlin DSL
- **Android Gradle Plugin**: 8.2.0

## Dependencies

- AndroidX Core KTX 1.12.0
- AndroidX AppCompat 1.6.1
- Material Design Components 1.11.0
- ConstraintLayout 2.1.4
- Lifecycle components 2.7.0

## Building the Project

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or later
- JDK 8 or higher
- Android SDK with API 34

### Build Instructions

1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Run the app on an emulator or physical device

### Command Line Build

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run tests
./gradlew test

# Install on connected device
./gradlew installDebug
```

## App Features

### Color Palette

The app includes 8 beautiful Material Design colors:
- Red (#F44336)
- Blue (#2196F3)
- Green (#4CAF50)
- Yellow (#FFEB3B)
- Purple (#9C27B0)
- Orange (#FF9800)
- Pink (#E91E63)
- Cyan (#00BCD4)

## Development

This project uses modern Android development practices:

- **View Binding**: Type-safe view access without findViewById
- **Material Design 3**: Latest Material Design components and theming
- **Kotlin**: Concise and expressive code
- **Gradle KTS**: Kotlin-based build configuration

## License

This project is open source and available under the [MIT License](LICENSE).

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.