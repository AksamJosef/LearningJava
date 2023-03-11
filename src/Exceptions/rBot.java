package Exceptions;

public class rBot {

    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);
        @Override
        void close();
    }
    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }
    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    public static class RobotConnectionClass implements RobotConnection{

        @Override
        public void moveRobotTo(int x, int y) {

        }

        @Override
        public void close() {

        }

    }

    public static void tryClose(RobotConnection robotConnection) {

        try {
            robotConnection.close();
        } catch (RuntimeException ignored) {
        }

    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection con = null;
        int i = 0;
        while (i < 3) {
            try {
                robotConnectionManager.getConnection();
                con.moveRobotTo(toX, toY);
                break;
            } catch (RobotConnectionException rce) {
                i++;
                if (i == 2) {
                    throw new RobotConnectionException("", rce);
                }
            } finally {
                try {
                    con.close();
                } catch (Throwable ignored) {}
            }
        }

//        for (int i = 0; i < 3; i++) {
//            try {
//                robotConnectionManager.getConnection();
//                con.moveRobotTo(toX, toY);
//                tryClose(con);
//                i = 3;
//            } catch (RobotConnectionException rce) {
//                tryClose(con);
//                if (i == 2) {
//                    throw new RobotConnectionException("Error");
//                }
//            } catch (RuntimeException re) {
//                tryClose(con);
//                i = 3;
//                throw new RuntimeException();
//            }
//        }

    }

}
