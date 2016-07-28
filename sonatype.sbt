// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "com.github.benniekrijger"

// To sync with Maven central, you need to supply the following information:
pomExtra in Global := {
  <url>https://github.com/benniekrijger/scala-mollie</url>
    <licenses>
      <license>
        <name>MIT License</name>
        <url>http://www.opensource.org/licenses/mit-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/benniekrijger/scala-mollie</url>
      <connection>scm:git:git:github.com:benniekrijger/scala-mollie.git</connection>
      <developerConnection>scm:git:git@github.com:benniekrijger/scala-mollie.git</developerConnection>
    </scm>
    <developers>
      <developer>
        <id>benniekrijger</id>
        <email>benniekrijger@hotmail.com</email>
        <name>Bennie Krijger</name>
        <url>https://github.com/benniekrijger</url>
      </developer>
    </developers>
}