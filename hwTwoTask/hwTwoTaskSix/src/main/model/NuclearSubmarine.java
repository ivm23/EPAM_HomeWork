package main.model;

public class NuclearSubmarine {
    private NuclearEngine nuclearEngine;
    private String statusNuclearSubmarine;
    private String statusNuclearEngine;

    public NuclearSubmarine() {
        statusNuclearSubmarine = "Nuclear submarine is ready!";
        nuclearEngine = new NuclearEngine();
    }

    class NuclearEngine {

        public NuclearEngine() {
            statusNuclearEngine = "Nuclear Engine is ready for start";
        }
        public void startEngine() {
            statusNuclearEngine = "Nuclear Engine is start";
        }
    }

    public String getStatusNuclearEngine() {
        return statusNuclearEngine;
    }

    public void startNuclearSubmarine() {
        nuclearEngine.startEngine();
        statusNuclearSubmarine = "Nuclear submarine has been sent sailing!";
    }

    public String getStatusNuclearSubmarine() {
        return statusNuclearSubmarine;
    }
}
