package com.quest.threads;

public class MatrixPgm implements Runnable {
    private final int[][] A;
    private final int[][] B;
    private final int[][] C;
    private final int row;

    public MatrixPgm(int[][] a, int[][] b, int[][] c, int row) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.row = row;
    }

    @Override
    public void run() {
        for (int i = 0; i < B[0].length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[row][i] += A[row][j] * B[j][i];
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};
        int[][] C = new int[A.length][B[0].length];

        Thread[] threads = new Thread[A.length];
        for (int i = 0; i < A.length; i++) {
            threads[i] = new Thread(new MatrixPgm(A, B, C, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }

        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}


