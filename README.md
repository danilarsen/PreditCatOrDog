# PreditCatOrDog

PreditCatOrDog is an Android application that leverages the power of machine learning to classify images as either a cat or a dog. This app is built using CatSDK, a powerful tool that simplifies the process of image classification with TensorFlow Lite.

## Features
- Image Classification: Instantly classifies whether an image is of a cat or a dog.
- Easy to use: Simple and intuitive interface.

## Installation
To run this project, clone it from GitHub and open it in Android Studio.

```gradle
git clone https://github.com/danilarsen/PreditCatOrDog.git
```
## Setup
Make sure you have the latest version of Android Studio installed to run this application.

## Adding Dependencies

This app relies on the CatSDK library, which in turn uses TensorFlow Lite dependencies. Ensure that these are correctly added to your build.gradle:

```gradle
dependencies {
    implementation 'com.github.danilarsen:CatSDK:1.0.2'
    // TensorFlow Lite dependencies
    implementation("org.tensorflow:tensorflow-lite-support:0.3.1")
    implementation("org.tensorflow:tensorflow-lite-metadata:0.1.0")
}
```

## Usage
Once you have the project open in Android Studio, you can build it on an emulator or a physical device. The app provides a straightforward interface to upload or capture an image, which it then processes to predict whether it's a cat or a dog.

## Contributing
Contributions to PreditCatOrDog are welcome. If you have suggestions or improvements, feel free to fork the repository and submit a pull request.

