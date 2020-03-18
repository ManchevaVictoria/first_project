package first_project;
public class sortirovka {

    public static int findplace(int[] massive, int i) {

        if (massive[i] > massive[0]) {

            return 0;

        }

        for (int k = 0; k < i - 1; k++) {

            if (massive[k] > massive[i] && massive[i] >= massive[k + 1]) {

                return k + 1;

            }

        }

        return i;

    }

}