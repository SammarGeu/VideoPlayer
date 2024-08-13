//Ques 31-Dekker's Algorithm
package algorithmAssignment;

class dekkersAlgo {
    private volatile int turn;
    private volatile boolean[] flag = new boolean[2];

    public dekkersAlgo() {
        turn = 0;
        flag[0] = false;
        flag[1] = false;
    }

    public void simulateProcess(int processNumber) {
        int otherProcess = 1 - processNumber;

        flag[processNumber] = true;

        while (flag[otherProcess]) {
            if (turn == otherProcess) {
                flag[processNumber] = false;
                while (turn == otherProcess) {
                }
                flag[processNumber] = true;
            }
        }

        System.out.println("Process " + processNumber + " enters the critical section");

        turn = otherProcess;
        flag[processNumber] = false;
    }

    public static void main(String[] args) {
        dekkersAlgo dekkers = new dekkersAlgo();

        int process1 = 0;
        int process2 = 1;

        dekkers.simulateProcess(process1);

        dekkers.simulateProcess(process2);
    }
}
