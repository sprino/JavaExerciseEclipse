Electron example application
====================

This is a very simple electron application that you can use to practice with UI testing on Electron.

To use it, you need to package it as electron app.
To do that we need to install *nodeJS*

 1. Download nodeJS installer for your environment from here: https://nodejs.org
 2. Run the installer

The installation will install the package manager *npm* as well.

Having npm we can install electron-packager, just execute via command line

>npm install electron-packager -g

Clone the repository on your local drive and run this command (see electron packager help to choose different platforms)

> electron-packager ./electron-demo-application/ calculator --platform=win32 --arch=x64 --version=1.2.4

The packager will create an executable file under calculator-win32-x64/calculator.exe

Run it!

