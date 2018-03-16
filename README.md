# DI Examples

Examples of several dependency injection (DI) libraries in Java.

#### Modules
- **di-feather** - example of [Feather](https://github.com/zsoltherpai/feather)
- **di-dagger** - example of [Google Dagger](https://github.com/google/dagger)
- **di-guice** - example of [Google Guice](https://github.com/google/guice)

#### Who is more lightweight
Package `.class` files of these libraries into the target jars via [Maven Shade Plugin](https://maven.apache.org/plugins/maven-shade-plugin/), and
compare the size of jar files:
```
Feather < Dagger < Guice
```