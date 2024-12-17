# Usage

Java Maven Project With Service SPI Locator Example

### Requirements:

```
Git: 2.50.0
Maven: 3.9+
Java: 24
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/java-service-spi.git
cd java-service-spi
```

```bash
mvn clean verify sonar:sonar -Pcoverage
```

```bash
mvn clean verify sonar:sonar -D"sonar.token=<your token>" -D"sonar.host.url=https://sonarcloud.io" -D"sonar.organization=deepaksorthiya" -D"sonar.projectKey=deepaksorthiya_java-service-spi" -Pcoverage
```
