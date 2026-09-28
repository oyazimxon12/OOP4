 class Logger {
        private static Logger instance;

        Logger() {
        }

        static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        void log(String message) {
            System.out.println(message);
        }
    }

