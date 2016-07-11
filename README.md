Petclinic Sample Application with Seed-Me support
============================

This is the standard introductory sample application for Grails with seed-me support. To get started with it, simply clone the repository and then from within your local copy run:

    ./gradlew run

on Unix-like systems, or

    gradlew run

on Windows via the command prompt. Once the server has started up, you can copy the URL and paste it in a browser.

Instead of inserting data via the BootStrap.groovy file I ported the data to seed files that seed-me uses to determine what data should be entered into the database. I used MySQL to persist the data so you can easily view and verify that data entry is truly being facilitated by the seed-me plugin.

Note: This particular application runs on a non-standard port, 8086. Look in the build.gradle file to change it to a port of your own liking.
