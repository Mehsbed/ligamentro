# Ligamentro - Sign Language Detector

<div align="center">
  <img src="app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Ligamentro Logo" width="200"/>
  
  [![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://www.android.com)
  [![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org)
  [![TensorFlow](https://img.shields.io/badge/TensorFlow-FF6F00?style=for-the-badge&logo=tensorflow&logoColor=white)](https://www.tensorflow.org)
  [![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)
</div>

## 📱 Overview

Ligamentro is an advanced Android application that leverages machine learning and computer vision to detect and interpret sign language gestures in real-time. The app uses the device's camera to capture hand movements and translates them into text, making communication more accessible for the deaf and hard-of-hearing community.

## ✨ Features

- **Real-time Sign Language Detection**: Instant recognition of sign language gestures using the device's camera
- **High Accuracy**: Powered by TensorFlow Lite for precise gesture recognition
- **Offline Support**: Works without internet connection once the model is downloaded
- **User-friendly Interface**: Clean and intuitive UI design
- **Multiple Sign Language Support**: Currently supports American Sign Language (ASL)
- **Performance Optimized**: Efficient processing for smooth real-time detection

## 🛠️ Technical Stack

- **Language**: Kotlin
- **Minimum SDK**: Android 6.0 (API level 23)
- **Target SDK**: Android 13 (API level 33)
- **Architecture**: MVVM (Model-View-ViewModel)
- **ML Framework**: TensorFlow Lite
- **Image Processing**: CameraX API
- **Dependency Injection**: Hilt
- **Coroutines**: For asynchronous operations
- **Material Design**: For modern UI components

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox (2020.3.1) or newer
- Android SDK 23 or higher
- Gradle 7.0 or higher
- JDK 11 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Mehsbed/ligamentro.git
   ```

2. Open the project in Android Studio

3. Sync the project with Gradle files

4. Build and run the application on your device or emulator

### Building from Source

1. Open the project in Android Studio
2. Wait for the Gradle sync to complete
3. Click on "Build" > "Build Bundle(s) / APK(s)" > "Build APK(s)"
4. The APK will be generated in `app/build/outputs/apk/debug/`

## 📦 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ligamentro/
│   │   │       ├── data/           # Data layer
│   │   │       ├── domain/         # Domain layer
│   │   │       ├── presentation/   # UI layer
│   │   │       └── utils/          # Utility classes
│   │   ├── res/                    # Resources
│   │   └── assets/                 # ML models and assets
│   └── test/                       # Unit tests
└── build.gradle.kts                # App-level build configuration
```

## 🤝 Contributing

We welcome contributions to Ligamentro! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- TensorFlow team for the ML framework
- Android team for the CameraX API
- Special thanks to all supporters of this project

## 📞 Contact

For any queries or support, please reach out to:
- Email: your.email@example.com
- Project Link: https://github.com/Mehsbed/ligamentro

## 📊 Future Roadmap

- [ ] Add support for more sign languages
- [ ] Implement gesture recording and playback
- [ ] Add voice output for detected signs
- [ ] Improve accuracy with larger training datasets
- [ ] Add offline dictionary for common signs
- [ ] Implement user customization for gesture recognition

---

<div align="center">
  Made with ❤️ by Mehank
</div> 