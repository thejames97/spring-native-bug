## Reproducer app for spring-native bug

When running the native image the framework throws "Not a managed type" exception on my Entity when my Entity class is not in the same package hierarchy as the application class, even though I've specified the package where the Entity is in the @EntityScan annotation. The app starts up and works fine in JVM mode. It also starts up and works fine in the native image when I move the Entity class to a sub-package of the application class. But this is not always possible (or even desirable).

### Test API endpoints
`curl --location --request GET 'localhost:8084/v1/users'`

`curl --location --request GET 'localhost:8084/v1/users/104'`

You can move User to 'org.bugme.domain' package (using refactor tools to adjust references) to see it work in native-image.