package Spyros;

import java.util.ArrayList;
import java.util.List;

        public class MarsApp {
            private String name;
            private double currentX, currentY, currentZ; // Position in space
            private double speed; // Speed in km/s
            private boolean isOperational;
            private List<String> missionLog;

            public MarsApp(String name) {
                this.name = name;
                this.currentX = 0;
                this.currentY = 0;
                this.currentZ = 0;
                this.speed = 0;
                this.isOperational = true;
                this.missionLog = new ArrayList<>();
                logEvent("Spacecraft " + name + " initialized.");
            }

            // Simulate moving the spacecraft
            public void move(double deltaX, double deltaY, double deltaZ) {
                if (!isOperational) {
                    System.out.println("Error: Spacecraft is not operational.");
                    return;
                }
                currentX += deltaX;
                currentY += deltaY;
                currentZ += deltaZ;
                logEvent("Moved to position (" + currentX + ", " + currentY + ", " + currentZ + ").");
            }

            // Adjust speed
            public void adjustSpeed(double newSpeed) {
                if (!isOperational) {
                    System.out.println("Error: Spacecraft is not operational.");
                    return;
                }
                speed = newSpeed;
                logEvent("Speed adjusted to " + speed + " km/s.");
            }

            // Simulate sending a message to Earth
            public void communicate(String message) {
                if (!isOperational) {
                    System.out.println("Error: Spacecraft is not operational.");
                    return;
                }
                logEvent("Communicated to Earth: " + message);
                System.out.println("Message sent to Earth: " + message);
            }

            // Simulate detecting an anomaly
            public void detectAnomaly(String anomaly) {
                isOperational = false;
                logEvent("Anomaly detected: " + anomaly);
                System.out.println("Critical anomaly detected: " + anomaly);
            }

            // Reactivate spacecraft
            public void repair() {
                isOperational = true;
                logEvent("Spacecraft repaired and operational.");
                System.out.println("Spacecraft repaired and is now operational.");
            }

            // Log mission events
            private void logEvent(String event) {
                missionLog.add(event);
            }

            // Print mission log
            public void printMissionLog() {
                System.out.println("Mission Log for " + name + ":");
                for (String event : missionLog) {
                    System.out.println(event);
                }
            }

            public static void main(String[] args) {
                MarsApp spacecraft = new MarsApp("Voyager-1");

                spacecraft.communicate("Launching mission to Mars.");
                spacecraft.move(1000, 2000, -500);
                spacecraft.adjustSpeed(25.3);
                spacecraft.communicate("Approaching Mars orbit.");

                spacecraft.detectAnomaly("Fuel leak detected.");
                spacecraft.repair();
                spacecraft.communicate("Continuing mission.");

                spacecraft.printMissionLog();
            }
        }
