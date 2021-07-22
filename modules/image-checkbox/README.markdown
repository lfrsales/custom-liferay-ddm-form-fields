[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
![GitHub top language][top-lenguage-shield]
[![LinkedIn][linkedin-shield]][linkedin-url]

# About The Module

This module offers an alternative to classic checkboxes by using an Image as selector.
![See in page][module-img]

## Built With

This Module has been build using the following software:
* [REACT](https://es.reactjs.org/)

# Getting Started

## Prerequisites

* This module is compatible with **Liferay 7.3**. The lastest tested version has been 7.3.10-sp1.

## Build it
` $ ./gradlew build `
The jar file will be in `build/libs/com.liferay.dynamic.data.mapping.form.field.type.internal.image.checkbox-{version}.jar`.

These are the relevant configuration properties used to build it locally:
- **gradle.properties**:
```
liferay.workspace.product = dxp-7.3-sp1
```
- **settings.gradle**
```
dependencies {
	classpath group: "com.liferay", name: "com.liferay.gradle.plugins.workspace", version: "3.3.2"
	classpath group: "net.saliman", name: "gradle-properties-plugin", version: "1.4.6"
}
```

## Deploy to Liferay
` $ ./gradlew deploy -Pauto.deploy.dir="/path/to/liferay/deploy"`

# Usage

1. Create a new form or editing a existing one.
2. In the *Elements* tab, go to *Customized Elements* and drag the **Imgage Checkbox** and drop it into your form.
3. Configure, inside the *Basic* tab, the **Image** selecting the image that you want show in your checkbox. Don't forget configure an alternative text `alt`.
4. **Save your form** to see the changes.

# TODO List

* Create Clay Card Checkbox

**PRs, issues and comments will be welcomed**

<!-- MARKDOWN LINKS & IMAGES -->
[contributors-shield]: https://img.shields.io/github/contributors/lfrsales/custom-liferay-ddm-form-fields.svg
[contributors-url]: https://github.com/lfrsales/custom-liferay-ddm-form-fields/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/lfrsales/custom-liferay-ddm-form-fields.svg
[forks-url]: https://github.com/lfrsales/custom-liferay-ddm-form-fields/network/members
[stars-shield]: https://img.shields.io/github/stars/lfrsales/custom-liferay-ddm-form-fields.svg
[stars-url]: https://github.com/lfrsales/custom-liferay-ddm-form-fields/stargazers
[issues-shield]: https://img.shields.io/github/issues/lfrsales/custom-liferay-ddm-form-fields.svg
[issues-url]: https://github.com/lfrsales/custom-liferay-ddm-form-fields/issues
[top-lenguage-shield]: https://img.shields.io/github/languages/top/lfrsales/custom-liferay-ddm-form-fields
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/-martin-dominguez/
[module-img]: doc-images/image-checkbox.gif