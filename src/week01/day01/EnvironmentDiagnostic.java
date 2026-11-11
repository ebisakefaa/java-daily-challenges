package week01.day01;

public class EnvironmentDiagnostic {
    static void main(String[] args) {
        // TODO 1.1: Welcome header
        System.out.println("Hello,morning");

        // TODO 1.2: Java version
        String javaVer = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVer);

        // TODO 1.3: Operating system and architecture
        String javaOs = System.getProperty("os.name");
        System.out.println("Operating System: " + javaOs);
        String javaArch = System.getProperty("os.arch");
        System.out.println("Architecture: " + javaArch);


        // TODO 1.4: Current username
        String userName = System.getProperty("user.name");
        System.out.println("Current User: " + userName);


    }
}
