package com.javarush.task.task15.task1503;

/* 
ООП - машинки
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class LuxuriousCar {
        protected void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        protected void printlnDesire(){
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";

        /*
            Рефакторинг, вложенные классы
            */
        public static class Solution {
            public class ServerNotAccessibleException extends Exception {
                public ServerNotAccessibleException() {
                    super("Server is not accessible for now.");
                }

                public ServerNotAccessibleException(Throwable cause) {
                    super("Server is not accessible for now.", cause);
                }
            }

            public class UnauthorizedUserException extends Exception {
                public UnauthorizedUserException() {
                    super("User is not authorized.");
                }

                public UnauthorizedUserException(Throwable cause) {
                    super("User is not authorized.", cause);
                }
            }

            public class BannedUserException extends Exception {
                public BannedUserException() {
                    super("User is banned.");
                }

                public BannedUserException(Throwable cause) {
                    super("User is banned.", cause);
                }
            }

            public class RestrictionException extends Exception {
                public RestrictionException() {
                    super("Access is denied.");
                }

                public RestrictionException(Throwable cause) {
                    super("Access is denied.", cause);
                }
            }

            public static void main(String[] args) {

            }
        }
    }
}
