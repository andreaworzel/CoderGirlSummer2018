import static java.lang.System.out;

public class Temperatures {

    public static void main(String[] args){
        int[][] temp = new int[4][7];
        temp[0][0] = 68;
        temp[0][1] = 70;
        temp[0][2] = 76;
        temp[0][3] = 70;
        temp[0][4] = 68;
        temp[0][5] = 71;
        temp[0][6] = 75;
        temp[1][0] = 76;
        temp[1][1] = 76;
        temp[1][2] = 87;
        temp[1][3] = 84;
        temp[1][4] = 82;
        temp[1][5] = 75;
        temp[1][6] = 83;
        temp[2][0] = 73;
        temp[2][1] = 72;
        temp[2][2] = 81;
        temp[2][3] = 78;
        temp[2][4] = 76;
        temp[2][5] = 73;
        temp[2][6] = 77;
        temp[3][0] = 64;
        temp[3][1] = 65;
        temp[3][2] = 69;
        temp[3][3] = 68;
        temp[3][4] = 70;
        temp[3][5] = 74;
        temp[3][6] = 72;

        out.println("Temperature Calculator");
        out.println();
        out.println("The data provided are:");

        int total7am = 0;
        for (int row = 0; row < 1; row++) {
            out.print("7 AM: ");
            for (int col = 0; col < 7; col++) {
                if (col == 6) {
                    out.print(temp[row][col]);
                    total7am = total7am + temp[row][col];
                } else {
                    out.print(temp[row][col] + ", ");
                    total7am = total7am + temp[row][col];
                }
            }
        }

        int average7am = total7am / 7;
        out.println();

        int total3pm = 0;
        for (int row = 1; row < 2; row++) {
            out.print("3 PM: ");
            for (int column = 0; column < 7; column++) {
                if (column == 6) {
                    out.print(temp[row][column]);
                    total3pm = total3pm + temp[row][column];
                } else {
                    out.print(temp[row][column] + ", ");
                    total3pm = total3pm + temp[row][column];
                }
            }
        }
        int average3pm = total3pm / 7;
        out.println();

        int total7pm = 0;
        for (int row = 2; row < 3; row++) {
            out.print("7 PM; ");
            for (int column = 0; column < 7; column++) {
                if (column == 6) {
                    out.print(temp[row][column]);
                    total7pm = total7pm + temp[row][column];
                } else {
                    out.print(temp[row][column] + ", ");
                    total7pm = total7pm + temp[row][column];
                }
            }
        }
        int average7pm = total7pm / 7;
        out.println();

        int total3am = 0;
        for (int row = 3; row < 4; row++) {
            out.print("3 AM: ");
            for (int column = 0; column < 7; column++) {
                if (column == 6) {
                    out.print(temp[row][column]);
                    total3am = total3am + temp[row][column];
                } else {
                    out.print(temp[row][column] + ", ");
                    total3am = total3am + temp[row][column];
                }
            }
        }
        int average3am = total3am / 7;
        out.println();
        out.println();
        out.println("Based on that data, the following are the average temperatures for the week.");
        out.println();
        int totalSun = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 1; column++) {
                totalSun = totalSun + temp[row][column];
            }
        }
        int averageSun = totalSun / 4;
        out.println("Sun: " + averageSun);

        int totalMon = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 1; column < 2; column++) {
                totalMon = totalMon + temp[row][column];
            }
        }
        int averageMon = totalMon / 4;
        out.println("Mon: " + averageMon);

        int totalTues = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 2; column < 3; column++) {
                totalTues = totalTues + temp[row][column];
            }
        }
        int averageTues = totalTues / 4;
        out.println("Tues: " + averageTues);

        int totalWeds = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 3; col < 4; col++) {
                totalWeds = totalWeds + temp[row][col];
            }
        }
        int averageWeds = totalWeds / 4;
        out.println("Weds: " + averageWeds);

        int totalThurs = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 4; col < 5; col++) {
                totalThurs = totalThurs + temp[row][col];
            }
        }
        int averageThurs = totalThurs / 4;
        out.println("Thu: " + averageThurs);

        int totalFri = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 5; col < 6; col++) {
                totalFri = totalFri + temp[row][col];
            }
        }
        int averageFri = totalFri / 4;
        out.println("Fri: " + averageFri);

        int totalSat = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 6; col < 7; col++) {
                totalSat = totalSat + temp[row][col];
            }
        }
        int averageSat = totalSat / 4;
        out.println("Sat; " + averageSat);
        out.println();
        out.println("7 AM: " + average7am);
        out.println("3 PM: " + average3pm);
        out.println("7 PM: " + average7pm);
        out.println("3 AM: " + average3am);
        out.println();
        int totalSum = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 7; col++) {
                totalSum = totalSum + temp[row][col];
            }
        }
        int totalAverage = totalSum / 28;
        out.println("The final average temoerature for the week was:");
        out.println();
        out.print("Overall: " + totalAverage);
    }
}
