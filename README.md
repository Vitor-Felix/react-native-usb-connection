
# react-native-usb-connection

## Getting started

`$ npm install react-native-usb-connection --save`

### Mostly automatic installation

`$ react-native link react-native-usb-connection`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-usb-connection` and add `RNUsbConnection.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNUsbConnection.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNUsbConnectionPackage;` to the imports at the top of the file
  - Add `new RNUsbConnectionPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-usb-connection'
  	project(':react-native-usb-connection').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-usb-connection/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-usb-connection')
  	```


## Usage
```javascript
import RNUsbConnection from 'react-native-usb-connection';

// TODO: What to do with the module?
RNUsbConnection;
```
  